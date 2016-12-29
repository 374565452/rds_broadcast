package com.cov001.rds.core.session.protocol.action;

import com.cov001.rds.core.audio.Mp3AudioFileUtil;
import com.cov001.rds.core.session.Session;
import com.cov001.rds.core.session.protocol.ProtocolConst;
import com.cov001.rds.core.session.protocol.ProtocolMsg;

public class BroadCastFileActionInvoke implements ActionInvoke {

	private Session session;

	public BroadCastFileActionInvoke(Session session) {
		this.session = session;
	}

	@Override
	public void invokeAction(ProtocolMsg msg) {
		if (msg.getDataLen() > 0 && msg.getData()[2] == 0x01) {
			System.out.println("-----开始播放mp3文件----");
			try {
				if (session.getAudioFileUtil() != null) {
					Mp3AudioFileUtil audioFile = session.getAudioFileUtil();
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
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
