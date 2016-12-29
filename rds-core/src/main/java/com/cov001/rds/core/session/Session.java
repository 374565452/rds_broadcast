package com.cov001.rds.core.session;

import org.springframework.context.ApplicationContext;

import com.cov001.rds.core.CoreServer;
import com.cov001.rds.core.audio.Mp3AudioFileUtil;
import com.cov001.rds.core.session.protocol.ElementInvoke;
import com.cov001.rds.service.IDeviceService;

import io.netty.channel.Channel;

public class Session {

	private CoreServer coreServer;

	public CoreServer getCoreServer() {
		return coreServer;
	}

	public void setCoreServer(CoreServer coreServer) {
		this.coreServer = coreServer;
	}

	// 设备的Sn号码，用来查找对应的设备信息
	private String deviceSn;

	private Mp3AudioFileUtil audioFileUtil;

	public Mp3AudioFileUtil getAudioFileUtil() {
		return audioFileUtil;
	}

	public void setAudioFileUtil(Mp3AudioFileUtil audioFileUtil) {
		this.audioFileUtil = audioFileUtil;
	}

	public String getDeviceSn() {
		return deviceSn;
	}

	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	private Channel channel;

	private ElementInvoke invoke;

	public ElementInvoke getInvoke() {
		return invoke;
	}

	public void setInvoke(ElementInvoke invoke) {
		this.invoke = invoke;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Session(Channel channel) {
		this.deviceSn = "";
		// this.coreServer = coreServer;
		this.channel = channel;
	}

	public void sendData(Object data) {
		boolean a = channel.isActive();
		// System.out.println("the active of the channel is === "+a);
		if (a) {
			// System.out.println("send teh data in the Session-------");
			// 发送数据的时候，还需要将此按照一定的格式，发送到插件
			channel.writeAndFlush(data);
		}
	}

	public void updateDeviceStatus(String status) {
		if (this.getCoreServer() != null) {
			CoreServer cs = this.getCoreServer();
			ApplicationContext ac = cs.getApplicationContext();
			if (ac != null) {
				System.out.println("查找设备进行注册操作");
				IDeviceService deviceService = ac.getBean(IDeviceService.class);
				// Device d = deviceService.getDeviceByDeviceNo(uid);
				deviceService.updateDeviceStatusByDeviceNo(this.deviceSn, status);
				// if (d != null) {
				// System.out.println("修改设备的连接状态");
				// d.setDevicestatus("8000000000000000");
				// deviceService.updateDevice(d);
				// }
			}
		}
	}

}
