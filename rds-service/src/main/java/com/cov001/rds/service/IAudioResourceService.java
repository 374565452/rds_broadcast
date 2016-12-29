package com.cov001.rds.service;

import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.pojo.AudioResource;

public interface IAudioResourceService {

	public PageDto getAllNoDeletedAudioResource(int page);

	public int insertAudioResource(AudioResource ar);
	
}
