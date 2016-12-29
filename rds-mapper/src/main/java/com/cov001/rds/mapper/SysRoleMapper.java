package com.cov001.rds.mapper;

import com.cov001.rds.pojo.SysRole;
import com.cov001.rds.pojo.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(String uid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExampleWithBLOBs(SysRoleExample example);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKeyWithBLOBs(SysRole record);

    int updateByPrimaryKey(SysRole record);
}