package com.cov001.rds.service;

import java.util.List;

import com.cov001.rds.pojo.DeviceType;

public interface IDeviceTypeService {

	public List<DeviceType> getAllDeviceType();
	
	public DeviceType getDeviceTypeByUid(String uid);
	
}
