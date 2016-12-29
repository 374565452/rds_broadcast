package com.cov001.rds.mapper;

import com.cov001.rds.pojo.DeviceType;
import com.cov001.rds.pojo.DeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeMapper {
    int countByExample(DeviceTypeExample example);

    int deleteByExample(DeviceTypeExample example);

    int deleteByPrimaryKey(String uid);

    int insert(DeviceType record);

    int insertSelective(DeviceType record);

    List<DeviceType> selectByExampleWithBLOBs(DeviceTypeExample example);

    List<DeviceType> selectByExample(DeviceTypeExample example);

    DeviceType selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    int updateByExample(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    int updateByPrimaryKeySelective(DeviceType record);

    int updateByPrimaryKeyWithBLOBs(DeviceType record);

    int updateByPrimaryKey(DeviceType record);
}