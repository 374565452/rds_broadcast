package com.cov001.rds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.common.dto.PageModel;
import com.cov001.rds.mapper.DeviceMapper;
import com.cov001.rds.pojo.Device;
import com.cov001.rds.pojo.DeviceExample;
import com.cov001.rds.pojo.DeviceExample.Criteria;
import com.cov001.rds.service.IDeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DeviceServiceImpl implements IDeviceService{

	@Autowired
	private DeviceMapper deviceMapper;
	
	@Override
	public List<Device> getAllDevice() {
		DeviceExample deviceExample=new DeviceExample();
		deviceExample.setOrderByClause("createDate desc");
		//Criteria criteria = deviceExample.createCriteria();
		
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		if(list !=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public Device getDeviceByUid(String uid) {
		DeviceExample deviceExample =new DeviceExample();
		Criteria criteria = deviceExample.createCriteria();
		criteria.andUidEqualTo(uid);
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		if(list!=null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Device getDeviceByDeviceNo(String deviceNo) {
		DeviceExample deviceExample =new DeviceExample();
		Criteria criteria = deviceExample.createCriteria();
		criteria.andDevicenoEqualTo(deviceNo);
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public int insertDevice(Device d) {
		return deviceMapper.insert(d);
	}

	@Override
	public PageDto getAllNoDeleteDevice(int page) {
		DeviceExample deviceExample=new DeviceExample();
		Criteria criteria = deviceExample.createCriteria();
		criteria.andDeletedEqualTo(0);
		PageModel model=new PageModel();
		PageHelper.startPage(page,model.getPageSize() );
		
		deviceExample.setOrderByClause("createDate desc");
		
		List<Device> list = deviceMapper.selectByExample(deviceExample);
		if(list !=null && list.size()>0){
			PageDto pageDto=new PageDto();
			
			
			model.setCurrentPage(page);
			//取总数
			PageInfo<Device> pageInfos=new PageInfo<Device>(list);
			model.setAllRecorder(pageInfos.getTotal());
			pageDto.setData(list);
			pageDto.setPageModel(model);
			return pageDto;
		}
		return null;
	}

	@Override
	public int deleteDeviceByUid(String uid) {
		
		DeviceExample example=new DeviceExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(uid);
		//criteria.andDeletedEqualTo(1);
		Device d=new Device();
		d.setDeleted(1);
		d.setUid(uid);
		return deviceMapper.updateByExampleSelective(d, example);
		//return 0;
	}

	/***
	 * 此处的性能还需要进行一下优化，应该进行批量修改操作，不能先查找再修改
	 */
	@Override
	public int deleteDeviceByUids(List<String> uids) {
		
		// TODO Auto-generated method stub
		/*DeviceExample example=new DeviceExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeletedEqualTo(1);
		criteria.andUidIn(uids);
		Device d =new Device();
		return deviceMapper.updateByExample(d, example);*/
		//return deviceMapper.deleteByExample(example);
		int i=0;
		if(uids != null && uids.size()>0){
			for (String string : uids) {
				i=deleteDeviceByUid(string);
				//Device d=deviceMapper.selectByPrimaryKey(string);
				//d.setDeleted(1);
				//deviceMapper.updateByPrimaryKey(d);
			}
		}
		return i;
	}

	@Override
	public int updateDevice(Device d) {
		return deviceMapper.updateByPrimaryKey(d);
	}

	@Override
	public int updateDeviceStatusByDeviceNo(String deviceNo,String deviceStatus) {
		return this.deviceMapper.updateStatusByDeviceNo(deviceNo, deviceStatus);
	}

	@Override
	public int updateDeviceStatusAll(String deviceStatus) {
		return deviceMapper.updateStatusAll(deviceStatus);
	}

}
