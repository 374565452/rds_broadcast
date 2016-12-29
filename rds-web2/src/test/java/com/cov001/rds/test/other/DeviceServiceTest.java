package com.cov001.rds.test.other;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cov001.rds.pojo.Device;
import com.cov001.rds.service.IDeviceService;

public class DeviceServiceTest {

	@Test
	public void testDeleteByUid(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

		IDeviceService ds = ac.getBean(IDeviceService.class);
		ds.deleteDeviceByUid("47f11795-17cf-483d-9de1-0ef3674c170e");
		
		Device d=ds.getDeviceByUid("47f11795-17cf-483d-9de1-0ef3674c170e");
		System.out.println(d.getDeleted().toString());
		
	}
	
	@Test
	public void testUpdateStatusByNo(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		
		IDeviceService ds = ac.getBean(IDeviceService.class);
		ds.updateDeviceStatusByDeviceNo("30ffdf05-48433531-19812243", "00000000000000FF");
	}
	
}
