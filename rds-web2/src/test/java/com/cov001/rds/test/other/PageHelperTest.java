package com.cov001.rds.test.other;

import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.pojo.Device;
import com.cov001.rds.service.IDeviceService;

public class PageHelperTest {

	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Test
	public void testMyBatisPageHelper() {

		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

		IDeviceService ds = ac.getBean(IDeviceService.class);
		PageDto pageDto = ds.getAllNoDeleteDevice(1);
		
		List<Device> list =(List<Device>)pageDto.getData();
		for (Device device : list) {
			String info=device.getUid()+"======"+format.format(device.getCreatedate());
			System.out.println(info);
		}
		System.out.println(pageDto.getPageModel().getTotalPage());
		System.out.println(pageDto.getPageModel().getAllRecorder());
	}

	@Test
	public void testMyBatisOrderBy() {
		
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		IDeviceService ds = ac.getBean(IDeviceService.class);
		 
		//PageDto pageDto = ds.getAllNoDeleteDevice(1);
		List<Device> list = ds.getAllDevice();
		for (Device device : list) {
			String info=device.getUid()+"======"+format.format(device.getCreatedate());
			System.out.println(info);
		}
	}

}
