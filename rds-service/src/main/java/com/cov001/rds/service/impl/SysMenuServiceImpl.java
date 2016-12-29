package com.cov001.rds.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov001.rds.common.dto.SysMenuDto;
import com.cov001.rds.mapper.SysMenuMapper;
import com.cov001.rds.pojo.SysMenu;
import com.cov001.rds.pojo.SysMenuExample;
import com.cov001.rds.pojo.SysMenuExample.Criteria;
import com.cov001.rds.service.ISysMenuService;

@Service
public class SysMenuServiceImpl implements ISysMenuService{

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	@Override
	public List<SysMenuDto> getAllMenu() {
		List<SysMenu> parentMenu=getMenuByParentId("0");
		if(parentMenu != null && parentMenu.size()>0){
			List<String> ids=new ArrayList<String> ();
			for (SysMenu sysMenu : parentMenu) {
				ids.add(sysMenu.getUid());
			}
			if(ids.size()>0){
				List<SysMenu> subMenus=getMenuByParentIds(ids);
				//查询到有数据
				if(subMenus !=null && subMenus.size()>0){
					List<SysMenuDto> menuDtos=new ArrayList<SysMenuDto>();
					for (SysMenu sysMenu : parentMenu) {
						SysMenuDto dto=new SysMenuDto();
						dto.setSysMenu(sysMenu);
						//List<SysMenu> tempMenus=new ArrayList<SysMenu>();
						dto.setSubMenu(new ArrayList<SysMenu>());
						for (SysMenu sysMenuDto : subMenus) {
							if(sysMenuDto.getParentid().equals(sysMenu.getUid())){
								//tempMenus.add(sysMenuDto);
								dto.getSubMenu().add(sysMenuDto);
							}
						}
						if(dto.getSubMenu()!=null && dto.getSubMenu().size()>0){
							String url=dto.getSysMenu().getMenuurl();
							if(url != null && url.length()>1){
								String uid=url.substring(1);
								dto.setUlId(uid);
							}
							
						}
						menuDtos.add(dto);
					}
					return menuDtos;
				}
			}
		}
		return null;
	}

	

	@Override
	public List<SysMenu> getMenuByParentId(String parentId) {
		SysMenuExample example=new SysMenuExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentidEqualTo(parentId);
		return sysMenuMapper.selectByExample(example);
	}

	@Override
	public List<SysMenu> getMenuByParentIds(List<String> ids) {
		SysMenuExample example=new SysMenuExample();
		Criteria criteria=example.createCriteria();
		criteria.andParentidIn(ids);
		return sysMenuMapper.selectByExample(example);
	}



	@Override
	public SysMenu getMenuById(String uid) {
		SysMenuExample example=new SysMenuExample();
		Criteria criteria=example.createCriteria();
		criteria.andUidEqualTo(uid);
		List<SysMenu> menus=sysMenuMapper.selectByExample(example);
		if(menus!= null && menus.size()>0){
			return menus.get(0);
		}
		return null;
	}

}
