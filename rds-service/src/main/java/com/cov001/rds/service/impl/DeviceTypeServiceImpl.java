package com.cov001.rds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov001.rds.mapper.DeviceTypeMapper;
import com.cov001.rds.pojo.DeviceType;
import com.cov001.rds.pojo.DeviceTypeExample;
import com.cov001.rds.pojo.DeviceTypeExample.Criteria;
import com.cov001.rds.service.IDeviceTypeService;

@Service
public class DeviceTypeServiceImpl implements IDeviceTypeService{

	@Autowired
	private DeviceTypeMapper deviceTypeMapper;
	
	@Override
	public List<DeviceType> getAllDeviceType() {
		DeviceTypeExample example=new DeviceTypeExample();
		List<DeviceType> list = deviceTypeMapper.selectByExample(example);
		if(list!= null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public DeviceType getDeviceTypeByUid(String uid) {
		DeviceTypeExample example=new DeviceTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(uid);
		List<DeviceType> list = deviceTypeMapper.selectByExample(example);
		if(list !=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
