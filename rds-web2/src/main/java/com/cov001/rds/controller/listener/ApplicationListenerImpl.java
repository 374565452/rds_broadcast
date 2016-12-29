package com.cov001.rds.controller.listener;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.cov001.rds.core.CoreServer;
import com.cov001.rds.service.IDeviceService;

@Component
public class ApplicationListenerImpl implements ApplicationListener<ApplicationEvent>{
	
	//直接通过spring，将CoreServer的对象注入进来
	@Resource(name="coreServer")
	private CoreServer server;
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ContextRefreshedEvent) {
			//System.out.println(host +" ====== "+port);
			//System.out.println(server);
			//程序只要重新启动，就应该将所有的设备状态置为连接断开
			ApplicationContext ac =((ContextRefreshedEvent) event).getApplicationContext();
			server.setApplicationContext(ac);
			IDeviceService ds=ac.getBean(IDeviceService.class);
			ds.updateDeviceStatusAll("00000000000000FF");
			
			new Thread(server).start();
		}
	}

}
