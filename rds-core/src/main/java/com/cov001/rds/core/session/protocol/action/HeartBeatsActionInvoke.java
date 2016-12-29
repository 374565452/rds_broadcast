package com.cov001.rds.core.session.protocol.action;

import com.cov001.rds.core.session.Session;
import com.cov001.rds.core.session.protocol.ProtocolMsg;

public class HeartBeatsActionInvoke implements ActionInvoke{

	private Session session;

	public HeartBeatsActionInvoke(Session session) {
		this.session = session;
	}
	
	@Override
	public void invokeAction(ProtocolMsg msg) {
		if(msg.getDataLen()>0 && msg.getData()[0]==0x01){
			System.out.println("设备向平台发送心跳数据---------");
			//直接将此心跳数据发送给客户端
			session.sendData(msg);
		}
	}

}
