package com.cov001.rds.core.session.protocol;

import java.util.HashMap;
import java.util.Map;

import com.cov001.rds.core.session.Session;
import com.cov001.rds.core.session.protocol.action.ActionInvoke;
import com.cov001.rds.core.session.protocol.action.BroadCastFileActionInvoke;
import com.cov001.rds.core.session.protocol.action.HeartBeatsActionInvoke;
import com.cov001.rds.core.session.protocol.action.RegisterActionInvoke;
import com.cov001.rds.core.session.protocol.action.StartBroadCastActionInvoke;

public class DeviceElementInvoke implements ElementInvoke{

	private Map<Short, ActionInvoke>  actionInvokes=new HashMap<Short, ActionInvoke>();
	
	private Session session;
	
	public DeviceElementInvoke(Session session) {
		this.session=session;
		actionInvokes.put(ProtocolConst.REGISTERCOMMAND, new RegisterActionInvoke(this.session));
		actionInvokes.put(ProtocolConst.STARTBROADCASTCOMMAND, new StartBroadCastActionInvoke(session));
		actionInvokes.put(ProtocolConst.BROADCASTFILECOMMAND, new BroadCastFileActionInvoke(session));
		actionInvokes.put(ProtocolConst.HEARTBEATSCOMMAND, new HeartBeatsActionInvoke(session));
	}
	
	@Override
	public void invoke(Object object) {
		if(object == null ){
			return;
		}
		ProtocolMsg msg=(ProtocolMsg) object;
		ActionInvoke invoke=actionInvokes.get(msg.getCommand());
		if(invoke != null){
			invoke.invokeAction(msg);
		}
		
//		System.out.println("------in the deviceElmentInvoke------");
//		ProtocolMsg msg=(ProtocolMsg)object;
//		byte[] data=msg.getData();
//		String uid=String.format("%02d%02d%02d%02d%02d%02d%02d%02d", 
//				data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]
//				);
//		System.out.println(uid);
//		int vol =(int)data[8];
//		System.out.println("the vol is "+vol);
//		
//		int freq=((data[9]&0xff)<<8)+(data[10]&0xff);
//		System.out.println("the freq is " +freq);
//		
//		String ip=String.format("%d.%d.%d.%d", data[11]&0xff,data[12]&0xff,data[13]&0xff,data[14]&0xff);
//		String gw=String.format("%d.%d.%d.%d", data[15]&0xff,data[16]&0xff,data[17]&0xff,data[18]&0xff);
//		String mask=String.format("%d.%d.%d.%d", data[19]&0xff,data[20]&0xff,data[21]&0xff,data[22]&0xff);
//		String dns=String.format("%d.%d.%d.%d", data[23]&0xff,data[24]&0xff,data[25]&0xff,data[26]&0xff);
//		String server=String.format("%d.%d.%d.%d", data[27]&0xff,data[28]&0xff,data[29]&0xff,data[30]&0xff);
//		int port=((data[31]&0xff)<<8)+(data[32]&0xff);
//		
//		System.out.println("ip = "+ip);
//		System.out.println("gw =" +gw);
//		System.out.println("mask = "+mask );
//		System.out.println("dns = "+dns);
//		System.out.println("server = "+server);
//		System.out.println("port = "+port);
//		System.out.println(String .format("the b is %x ",msg.getHeader()));
//		System.out.println(String .format("the b is %x ",msg.getTail()));
//		
//		System.out.println("the command is " + msg.getCommand());
//		System.out.println("the datalen is " +msg.getDataLen());
//		
//		System.out.println("the real data len is "+msg.getData().length);
	}

}
