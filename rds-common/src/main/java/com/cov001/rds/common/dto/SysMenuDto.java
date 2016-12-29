package com.cov001.rds.common.dto;


import java.util.List;

import com.cov001.rds.pojo.SysMenu;

public class SysMenuDto {

	private SysMenu sysMenu;
	
	private List<SysMenu> subMenu;

	/***
	 * 当subMenu不为空时，ulId的值应该为sysMenu的url去掉#
	 */
	private String ulId;
	
	public String getUlId() {
		return ulId;
	}

	public void setUlId(String ulId) {
		this.ulId = ulId;
	}

	public SysMenu getSysMenu() {
		return sysMenu;
	}

	public void setSysMenu(SysMenu sysMenu) {
		this.sysMenu = sysMenu;
	}

	public List<SysMenu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<SysMenu> subMenu) {
		this.subMenu = subMenu;
	}
	
	
	
}
