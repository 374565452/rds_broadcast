package com.cov001.rds.mapper;

import com.cov001.rds.pojo.SysAction;
import com.cov001.rds.pojo.SysActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysActionMapper {
    int countByExample(SysActionExample example);

    int deleteByExample(SysActionExample example);

    int deleteByPrimaryKey(String uid);

    int insert(SysAction record);

    int insertSelective(SysAction record);

    List<SysAction> selectByExampleWithBLOBs(SysActionExample example);

    List<SysAction> selectByExample(SysActionExample example);

    SysAction selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") SysAction record, @Param("example") SysActionExample example);

    int updateByExampleWithBLOBs(@Param("record") SysAction record, @Param("example") SysActionExample example);

    int updateByExample(@Param("record") SysAction record, @Param("example") SysActionExample example);

    int updateByPrimaryKeySelective(SysAction record);

    int updateByPrimaryKeyWithBLOBs(SysAction record);

    int updateByPrimaryKey(SysAction record);
}