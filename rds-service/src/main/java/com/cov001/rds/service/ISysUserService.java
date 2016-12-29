package com.cov001.rds.service;

import java.util.List;

import com.cov001.rds.pojo.SysUser;

public interface ISysUserService {

	public List<SysUser> getAllUser();
	
	public SysUser getUserByUserName(String name);
	
	public SysUser getUserByUid(String uid);
	
}
