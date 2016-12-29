package com.cov001.rds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov001.rds.mapper.SysUserMapper;
import com.cov001.rds.pojo.SysUser;
import com.cov001.rds.pojo.SysUserExample;
import com.cov001.rds.pojo.SysUserExample.Criteria;
import com.cov001.rds.service.ISysUserService;

@Service
public class SysUserService implements ISysUserService{

	@Autowired
	private SysUserMapper userMapper;
	
	@Override
	public List<SysUser> getAllUser() {
		SysUserExample example=new SysUserExample();
		List<SysUser> users=userMapper.selectByExample(example);
		if(users !=null && users.size()>0){
			return users;
		}
		return null;
	}

	@Override
	public SysUser getUserByUserName(String name) {
		SysUserExample example=new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(name);
		List<SysUser> users=userMapper.selectByExample(example);
		if(users !=null && users .size()>0){
			return users.get(0);
		}
		return null;
	}

	@Override
	public SysUser getUserByUid(String uid) {
		SysUserExample example=new SysUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(uid);
		List<SysUser> users=userMapper.selectByExample(example);
		if(users !=null && users .size()>0){
			return users.get(0);
		}
		return null;
	}

}
