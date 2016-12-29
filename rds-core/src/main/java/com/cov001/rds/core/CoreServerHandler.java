package com.cov001.rds.core;


import org.apache.log4j.Logger;

import com.cov001.rds.core.session.SessionFactory;
import com.cov001.rds.core.session.protocol.ProtocolMsg;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

public class CoreServerHandler extends ChannelInboundHandlerAdapter {
	
	private static Logger logger = Logger.getLogger(CoreServerHandler.class);
	
	private CoreServer coreServer;

	public CoreServerHandler(CoreServer coreServer) {
		this.coreServer = coreServer;
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		//System.out.println("accept a client --------the channel hashcode is" + ctx.channel().hashCode());
		// if(this.coreServer != null){
		// coreServer.getSessionFactory().put(ctx.channel()
		// ,coreServer.getPlugin());
		// }
		//logger.info("accept a client --------the channel hashcode is" + ctx.channel().hashCode());
		if(this.coreServer!=null){
			SessionFactory sessionFactory = coreServer.getSessionFactory();
			if(sessionFactory!=null){
				sessionFactory.put(ctx.channel(),coreServer);
			}
		}
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		System.out.println("disconnected a client --------");
		// if(coreServer!=null){
		// coreServer.getSessionFactory().remove(ctx.channel());
		// }
		if(this.coreServer!=null){
			SessionFactory sessionFactory = coreServer.getSessionFactory();
			if(sessionFactory!=null){
				sessionFactory.remove(ctx.channel());
			}
		}
		//ctx.close();
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		
		if(msg instanceof ProtocolMsg){
			if(this.coreServer != null){
				this.coreServer.getSessionFactory().invokeRead(ctx.channel(), (ProtocolMsg)msg);
			}
		}
		
		// 获取到数据后，还需要将此终端返回的数据发送到前端websocket
		// super.channelRead(ctx, msg);
		// 在不加解码器的情况下。msg是ByteBuf对象，添加上解码器之后，就不可以拉

		// 在这里之前是这样写的
		/*
		 * ctx.channel().writeAndFlush(new Integer(4)); 在客户端中，一直接收不到数据是因为没有配置编码
		 * 器， 只是配置拉一个解码器
		 * 然后改成ctx.channel().writeAndFlush(msg).就可以发送成功。因为msg是ByteBuf类型的
		 */
		// ctx.channel().writeAndFlush(msg);
		// System.out.println("received----the data----");
		// ctx.channel().flush();
	}

	@Override
	public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
		System.out.println("----------into the user event triggered--------");
		if (evt instanceof IdleStateEvent) {
			IdleStateEvent event = (IdleStateEvent) evt;
			if (event.state().equals(IdleState.READER_IDLE)) {
				System.out.println("-----等待客户端数据超时，关闭此连接-----");
				ctx.disconnect();
				// 超时关闭channel
				ctx.close();
			} 
			/*else if (event.state().equals(IdleState.WRITER_IDLE)) {
				System.out.println("--------WRITER_IDLE-----");
			} else if (event.state().equals(IdleState.ALL_IDLE)) {
				System.out.println("----ALL_IDLE-----");
				// 发送心跳
				ctx.channel().write("---ping\n---");
			}*/
		}
		super.userEventTriggered(ctx, evt);
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		// super.channelReadComplete(ctx);
		//System.out.println("received complete---- --------");
	}

//	@Override
//	public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
//		// super.channelRegistered(ctx);
//		System.out.println("registered a client---- --------");
//	}

//	@Override
//	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
//		// super.channelUnregistered(ctx);
//		System.out.println("unregistered a client---- --------");
//	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		//super.exceptionCaught(ctx, cause);
		if(this.coreServer!=null){
			SessionFactory sessionFactory = coreServer.getSessionFactory();
			if(sessionFactory!=null){
				sessionFactory.remove(ctx.channel());
			}
		}
		// System.out.println("catch the exception -------");
	}
}
