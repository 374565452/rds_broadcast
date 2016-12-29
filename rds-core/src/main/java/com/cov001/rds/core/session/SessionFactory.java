package com.cov001.rds.core.session;

import java.util.HashMap;
import java.util.Map;

import com.cov001.rds.core.CoreServer;
import com.cov001.rds.core.session.protocol.DeviceElementInvoke;

import io.netty.channel.Channel;

public class SessionFactory {

	private Map<Integer, Session> sessions = new HashMap<Integer, Session>();

	public Map<Integer, Session> getSessions() {
		return sessions;
	}

	public void setSessions(Map<Integer, Session> sessions) {
		this.sessions = sessions;
	}

	private static volatile SessionFactory instance;

	private SessionFactory() {

	}

	public static SessionFactory getInstance() {
		if (instance == null) {
			synchronized (SessionFactory.class) {
				if (instance == null) {
					instance = new SessionFactory();
				}
			}
		}
		return instance;
	}

	public void put(Channel channel,CoreServer coreServer) {
		synchronized (sessions) {
			Session session = new Session(channel);
			session.setCoreServer(coreServer);
			this.sessions.put(channel.hashCode(), session);
		}

	}

	public void remove(Channel channel) {
		//此处remove之前，应该将设备的状态进行一次更新操作，设置为未连接状态
		Session session=this.sessions.get(channel.hashCode());
		session.updateDeviceStatus("00000000000000FF");
		
		
		this.sessions.remove(channel.hashCode());
	}

	public void invokeRead(Channel channel, Object object) {
		synchronized (sessions) {
			Session session = this.sessions.get(channel.hashCode());
			if (session != null) {
				if (session.getInvoke() == null) {
					// System.out.println("in the sessionFaction session is = "
					// + session);
					DeviceElementInvoke invoke = new DeviceElementInvoke(session);
					session.setInvoke(invoke);
				}
				session.getInvoke().invoke(object);
			}
		}
	}
}
