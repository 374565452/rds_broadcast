package com.cov001.rds.core.session.protocol.action;

import org.springframework.context.ApplicationContext;

import com.cov001.rds.core.CoreServer;
import com.cov001.rds.core.session.Session;
import com.cov001.rds.core.session.protocol.ProtocolConst;
import com.cov001.rds.core.session.protocol.ProtocolMsg;
import com.cov001.rds.pojo.Device;
import com.cov001.rds.service.IDeviceService;

public class RegisterActionInvoke implements ActionInvoke {

	private Session session;

	public RegisterActionInvoke(Session session) {
		this.session = session;
	}

	@Override
	public void invokeAction(ProtocolMsg msg) {
		// 现在的注册，只是一个将设备中的UID号发送上来即可
		byte[] data = msg.getData();

		System.out.println("the command is " + msg.getCommand());
		System.out.println("the datalen is " + msg.getDataLen());
		String uid = String.format("%02x%02x%02x%02x-%02x%02x%02x%02x-%02x%02x%02x%02x", data[0], data[1], data[2],
				data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10], data[11]);
		System.out.println(uid);
		// 注册成功后，需要修改数据库的设备状态信息
		// 开始发送mp3测试数据
		/*
		 * ProtocolMsg p_msg=new ProtocolMsg();
		 * p_msg.setCommand(ProtocolConst.STARTBROADCASTCOMMAND);
		 * p_msg.setHeader(ProtocolConst.PROTOCOLHeader);
		 * p_msg.setTail(ProtocolConst.PROTOCOLTAIL);
		 * p_msg.setDataLen((short)1); byte buf[]=new byte[1]; buf[0]=0x01;
		 * p_msg.setData(buf); session.sendData(p_msg);
		 */
		session.setDeviceSn(uid);
		session.updateDeviceStatus("8000000000000000");

		// System.out.println("send the start broadcast command");

	}

	public void test_01(ProtocolMsg msg) {
		System.out.println("------in the RegisterActionInvoke------");
		byte[] data = msg.getData();
		String uid = String.format("%02d%02d%02d%02d%02d%02d%02d%02d", data[0], data[1], data[2], data[3], data[4],
				data[5], data[6], data[7]);
		System.out.println(uid);
		int vol = (int) data[8];
		System.out.println("the vol is " + vol);

		int freq = ((data[9] & 0xff) << 8) + (data[10] & 0xff);
		System.out.println("the freq is " + freq);

		String ip = String.format("%d.%d.%d.%d", data[11] & 0xff, data[12] & 0xff, data[13] & 0xff, data[14] & 0xff);
		String gw = String.format("%d.%d.%d.%d", data[15] & 0xff, data[16] & 0xff, data[17] & 0xff, data[18] & 0xff);
		String mask = String.format("%d.%d.%d.%d", data[19] & 0xff, data[20] & 0xff, data[21] & 0xff, data[22] & 0xff);
		String dns = String.format("%d.%d.%d.%d", data[23] & 0xff, data[24] & 0xff, data[25] & 0xff, data[26] & 0xff);
		String server = String.format("%d.%d.%d.%d", data[27] & 0xff, data[28] & 0xff, data[29] & 0xff,
				data[30] & 0xff);
		int port = ((data[31] & 0xff) << 8) + (data[32] & 0xff);

		System.out.println("ip = " + ip);
		System.out.println("gw =" + gw);
		System.out.println("mask = " + mask);
		System.out.println("dns = " + dns);
		System.out.println("server = " + server);
		System.out.println("port = " + port);
		System.out.println(String.format("the b is %x ", msg.getHeader()));
		System.out.println(String.format("the b is %x ", msg.getTail()));

		System.out.println("the command is " + msg.getCommand());
		System.out.println("the datalen is " + msg.getDataLen());

		System.out.println("the real data len is " + msg.getData().length);

		ProtocolMsg responseMsg = new ProtocolMsg();

		responseMsg.setHeader(ProtocolConst.PROTOCOLHeader);
		responseMsg.setTail(ProtocolConst.PROTOCOLTAIL);
		responseMsg.setCommand(ProtocolConst.REGISTERCOMMAND);
		responseMsg.setDataLen((short) 1);
		responseMsg.setData(new byte[] { 0x01 });
		if (this.session != null) {
			this.session.sendData(responseMsg);
		}
	}

}
