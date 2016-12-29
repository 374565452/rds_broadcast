package com.cov001.rds.mapper;

import com.cov001.rds.pojo.SysUserrole;
import com.cov001.rds.pojo.SysUserroleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserroleMapper {
    int countByExample(SysUserroleExample example);

    int deleteByExample(SysUserroleExample example);

    int deleteByPrimaryKey(String uid);

    int insert(SysUserrole record);

    int insertSelective(SysUserrole record);

    List<SysUserrole> selectByExample(SysUserroleExample example);

    SysUserrole selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") SysUserrole record, @Param("example") SysUserroleExample example);

    int updateByExample(@Param("record") SysUserrole record, @Param("example") SysUserroleExample example);

    int updateByPrimaryKeySelective(SysUserrole record);

    int updateByPrimaryKey(SysUserrole record);
}