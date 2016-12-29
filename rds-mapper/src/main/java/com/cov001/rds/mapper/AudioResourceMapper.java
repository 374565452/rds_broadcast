package com.cov001.rds.mapper;

import com.cov001.rds.pojo.AudioResource;
import com.cov001.rds.pojo.AudioResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AudioResourceMapper {
    int countByExample(AudioResourceExample example);

    int deleteByExample(AudioResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AudioResource record);

    int insertSelective(AudioResource record);

    List<AudioResource> selectByExample(AudioResourceExample example);

    AudioResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AudioResource record, @Param("example") AudioResourceExample example);

    int updateByExample(@Param("record") AudioResource record, @Param("example") AudioResourceExample example);

    int updateByPrimaryKeySelective(AudioResource record);

    int updateByPrimaryKey(AudioResource record);
}