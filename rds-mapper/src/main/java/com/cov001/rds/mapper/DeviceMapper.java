package com.cov001.rds.mapper;

import com.cov001.rds.pojo.Device;
import com.cov001.rds.pojo.DeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    int countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    int deleteByPrimaryKey(String uid);

    int insert(Device record);

    int insertSelective(Device record);

    List<Device> selectByExample(DeviceExample example);

    Device selectByPrimaryKey(String uid);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);
    
    //add by kqz
    int updateStatusByDeviceNo(@Param("deviceNo") String deviceNo,@Param("deviceStatus")String deviceStatus);
    int updateStatusAll(String deviceStatus);
    
    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}