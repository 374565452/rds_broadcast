package com.cov001.rds.mapper;

import com.cov001.rds.pojo.SysRoleaction;
import com.cov001.rds.pojo.SysRoleactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleactionMapper {
    int countByExample(SysRoleactionExample example);

    int deleteByExample(SysRoleactionExample example);

    int deleteByPrimaryKey(String uid);

    int insert(SysRoleaction record);

    int insertSelective(SysRoleaction record);

    List<SysRoleaction> selectByExample(SysRoleactionExample example);

    SysRoleaction selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") SysRoleaction record, @Param("example") SysRoleactionExample example);

    int updateByExample(@Param("record") SysRoleaction record, @Param("example") SysRoleactionExample example);

    int updateByPrimaryKeySelective(SysRoleaction record);

    int updateByPrimaryKey(SysRoleaction record);
}