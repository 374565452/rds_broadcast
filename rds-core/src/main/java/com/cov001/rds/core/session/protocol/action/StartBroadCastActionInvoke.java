package com.cov001.rds.core.session.protocol.action;

import com.cov001.rds.core.audio.Mp3AudioFileUtil;
import com.cov001.rds.core.session.Session;
import com.cov001.rds.core.session.protocol.ProtocolConst;
import com.cov001.rds.core.session.protocol.ProtocolMsg;

public class StartBroadCastActionInvoke implements ActionInvoke {

	private Session session;

	private Mp3AudioFileUtil audioFile;
	private String path = "E:\\mp3\\大海.mp3";

	public StartBroadCastActionInvoke(Session session) {
		this.session = session;
	}

	@Override
	public void invokeAction(ProtocolMsg msg) {
		System.out.println("收到来自客户端开始播放语音的指令。。。。。");
		if (msg.getDataLen() > 0 && msg.getData()[0] == 0x01) {
			// 此时可以进行发送音频数据文件
			if (audioFile == null) {
				try {
					audioFile = new Mp3AudioFileUtil(path);
					System.out.println("创建mp3 audio file util 类文件");
					session.setAudioFileUtil(audioFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				byte[] readcount = audioFile.readFile(1024);
				if (readcount != null) {
					ProtocolMsg pmsg = new ProtocolMsg();
					pmsg.setCommand(ProtocolConst.BROADCASTFILECOMMAND);
					pmsg.setHeader(ProtocolConst.PROTOCOLHeader);
					pmsg.setTail(ProtocolConst.PROTOCOLTAIL);
					pmsg.setDataLen((short) (readcount.length));
					pmsg.setData(readcount);
					session.sendData(pmsg);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
