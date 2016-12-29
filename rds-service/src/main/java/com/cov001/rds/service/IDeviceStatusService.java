package com.cov001.rds.service;

import java.util.List;

import com.cov001.rds.pojo.DeviceStatus;

public interface IDeviceStatusService {

	public List<DeviceStatus> getAllDeviceStatus();
	
	public DeviceStatus getDeviceStatusByValue(String deviceStatusValue);
	
}
