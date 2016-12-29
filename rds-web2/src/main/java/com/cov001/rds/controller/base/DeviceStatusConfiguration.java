package com.cov001.rds.controller.base;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DeviceStatusConfiguration {

	private Map<String,String> deviceStatus;

	public Map<String, String> getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(Map<String, String> deviceStatus) {
		this.deviceStatus = deviceStatus;
	}
	
	public Map<String, String> getDeviceStatusMap(String code) {
		Map<String, String> returnMap = new HashMap<String, String>();
		if (deviceStatus.get(code) != null) {
			returnMap.put("code", code);
			returnMap.put("msg", deviceStatus.get(code));
		}
		return returnMap;
	}
	
	public String getDeviceStatus(String code) {
		return deviceStatus.get(code);
	}
	
}
