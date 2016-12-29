package com.cov001.rds.service;

import java.util.List;

import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.pojo.Device;

public interface IDeviceService {

	public List<Device> getAllDevice();
	
	public Device getDeviceByUid(String uid);
	
	public Device getDeviceByDeviceNo(String deviceNo);
	
	public int insertDevice(Device d);
	
	public PageDto getAllNoDeleteDevice(int page);
	
	public int deleteDeviceByUid(String uid);
	
	public int deleteDeviceByUids(List<String> uids);
	
	public int updateDevice(Device d);
	
	public int updateDeviceStatusByDeviceNo(String deviceNo,String deviceStatus);
	
	public int updateDeviceStatusAll(String deviceStatus);
	
}
