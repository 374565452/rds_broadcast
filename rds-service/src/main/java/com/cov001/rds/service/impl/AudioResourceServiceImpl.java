package com.cov001.rds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.common.dto.PageModel;
import com.cov001.rds.mapper.AudioResourceMapper;
import com.cov001.rds.pojo.AudioResource;
import com.cov001.rds.pojo.AudioResourceExample;
import com.cov001.rds.pojo.AudioResourceExample.Criteria;
import com.cov001.rds.service.IAudioResourceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class AudioResourceServiceImpl implements IAudioResourceService{

	@Autowired
	private AudioResourceMapper audioResorceMapper;
	
	@Override
	public PageDto getAllNoDeletedAudioResource(int page) {
		
		AudioResourceExample example=new AudioResourceExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeletedEqualTo(0);
		
		PageModel model=new PageModel();
		PageHelper.startPage(page, model.getPageSize());
		
		example.setOrderByClause("id asc");
		List<AudioResource> list = audioResorceMapper.selectByExample(example);
		if(list != null && list.size()>0){
			PageDto dto=new PageDto();
			
			model.setCurrentPage(page);
			PageInfo<AudioResource> pageInfos=new PageInfo<AudioResource>(list);
			model.setAllRecorder(pageInfos.getTotal());
			
			dto.setPageModel(model);
			dto.setData(list);
			return dto;
		}
		return null;
	}

	@Override
	public int insertAudioResource(AudioResource ar) {
		return audioResorceMapper.insert(ar);
	}

}
