package com.cov001.rds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov001.rds.mapper.DeviceStatusMapper;
import com.cov001.rds.pojo.DeviceStatus;
import com.cov001.rds.pojo.DeviceStatusExample;
import com.cov001.rds.pojo.DeviceStatusExample.Criteria;
import com.cov001.rds.service.IDeviceStatusService;

@Service
public class DeviceStatusServiceImpl implements IDeviceStatusService{

	@Autowired
	private DeviceStatusMapper deviceStatusMapper;
	
	@Override
	public List<DeviceStatus> getAllDeviceStatus() {
		DeviceStatusExample deviceStatusExample=new DeviceStatusExample();
		List<DeviceStatus> lists = deviceStatusMapper.selectByExample(deviceStatusExample);
		if(lists !=null && lists.size()>0){
			return lists;
		}
		return null;
	}

	@Override
	public DeviceStatus getDeviceStatusByValue(String deviceStatusValue) {
		
		DeviceStatusExample deviceStatusExample=new DeviceStatusExample();
		Criteria criteria = deviceStatusExample.createCriteria();
		criteria.andDevicestatusvalueEqualTo(deviceStatusValue);
		List<DeviceStatus> list = deviceStatusMapper.selectByExample(deviceStatusExample);
		if(list!= null && list.size() >0){
			return list.get(0);
		}
		
		return null;
	}

}
