package com.cov001.rds.mapper;

import com.cov001.rds.pojo.SysRolemenu;
import com.cov001.rds.pojo.SysRolemenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolemenuMapper {
    int countByExample(SysRolemenuExample example);

    int deleteByExample(SysRolemenuExample example);

    int deleteByPrimaryKey(String uid);

    int insert(SysRolemenu record);

    int insertSelective(SysRolemenu record);

    List<SysRolemenu> selectByExample(SysRolemenuExample example);

    SysRolemenu selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") SysRolemenu record, @Param("example") SysRolemenuExample example);

    int updateByExample(@Param("record") SysRolemenu record, @Param("example") SysRolemenuExample example);

    int updateByPrimaryKeySelective(SysRolemenu record);

    int updateByPrimaryKey(SysRolemenu record);
}