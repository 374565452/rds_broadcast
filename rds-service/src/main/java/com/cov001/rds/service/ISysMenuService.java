package com.cov001.rds.service;

import java.util.List;

import com.cov001.rds.common.dto.SysMenuDto;
import com.cov001.rds.pojo.SysMenu;

public interface ISysMenuService {

	public List<SysMenuDto> getAllMenu();
	
	public SysMenu getMenuById(String uid);
	
	public List<SysMenu> getMenuByParentId(String parentId);
	
	public List<SysMenu> getMenuByParentIds(List<String> ids);
	
}
