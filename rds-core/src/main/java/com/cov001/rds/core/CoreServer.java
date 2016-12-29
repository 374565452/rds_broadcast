package com.cov001.rds.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cov001.rds.core.session.SessionFactory;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

@Component(value="coreServer")
@Scope("singleton")
public class CoreServer implements Runnable {

	@Value("${core.server.port}")
	private int port;

	private ApplicationContext applicationContext;
	
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public CoreServer() {
		sessionFactory=SessionFactory.getInstance();
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	private String host;

//	private static volatile CoreServer coreServer;
//	public static CoreServer getCoreServer(){
//		if(coreServer==null){
//			synchronized (CoreServer.class) {
//				if(coreServer==null){
//					coreServer=new CoreServer();
//				}
//			}
//		}
//		return coreServer;
//	}
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/** 用于分配处理业务线程的线程组个数 */
	public static final int BIZGROUPSIZE = 1; // 默认
	/** 业务出现线程大小 */
	public static final int BIZTHREADSIZE = Runtime.getRuntime().availableProcessors();

	private final EventLoopGroup bossGroup = new NioEventLoopGroup(BIZGROUPSIZE);
	private final EventLoopGroup workerGroup = new NioEventLoopGroup(BIZTHREADSIZE);
	private ChannelFuture channelFutureBind;

	public void startListener() {
		try {
			ServerBootstrap serverBootstrap = new ServerBootstrap();

			serverBootstrap.group(bossGroup, workerGroup);
			serverBootstrap.option(ChannelOption.SO_REUSEADDR, true);
			serverBootstrap.option(ChannelOption.TCP_NODELAY, true);
			serverBootstrap.option(ChannelOption.SO_KEEPALIVE, true);

			serverBootstrap.channel(NioServerSocketChannel.class);
			serverBootstrap.childHandler(new CoreServerChannelInitializer(this));

			if (host != null) {
				
				channelFutureBind = serverBootstrap.bind(host, port);
			} else {
				//这里是绑定所有的IP地址
				channelFutureBind = serverBootstrap.bind(port);
			}

			String info = String.format("the core server is starting at %d", this.port);
			System.out.println(info);
			// logger.info("TCP服务器已启动");

			channelFutureBind.channel().closeFuture().sync();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (channelFutureBind != null) {
				channelFutureBind.channel().close();
			}
			channelFutureBind = null;

		}
	}

	@Override
	public void run() {
		while(true){
			this.startListener();
		}
	}

}
