package com.cov001.rds.mapper;

import com.cov001.rds.pojo.DeviceStatus;
import com.cov001.rds.pojo.DeviceStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceStatusMapper {
    int countByExample(DeviceStatusExample example);

    int deleteByExample(DeviceStatusExample example);

    int deleteByPrimaryKey(String uid);

    int insert(DeviceStatus record);

    int insertSelective(DeviceStatus record);

    List<DeviceStatus> selectByExampleWithBLOBs(DeviceStatusExample example);

    List<DeviceStatus> selectByExample(DeviceStatusExample example);

    DeviceStatus selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") DeviceStatus record, @Param("example") DeviceStatusExample example);

    int updateByExampleWithBLOBs(@Param("record") DeviceStatus record, @Param("example") DeviceStatusExample example);

    int updateByExample(@Param("record") DeviceStatus record, @Param("example") DeviceStatusExample example);

    int updateByPrimaryKeySelective(DeviceStatus record);

    int updateByPrimaryKeyWithBLOBs(DeviceStatus record);

    int updateByPrimaryKey(DeviceStatus record);
}