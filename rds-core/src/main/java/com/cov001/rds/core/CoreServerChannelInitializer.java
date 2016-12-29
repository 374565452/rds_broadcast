package com.cov001.rds.core;

import java.util.concurrent.TimeUnit;

import com.cov001.rds.core.codec.ProtocolDecoder;
import com.cov001.rds.core.codec.ProtocolEncoder;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

public class CoreServerChannelInitializer extends ChannelInitializer<SocketChannel> {

	private CoreServer coreserver;

	public CoreServerChannelInitializer(CoreServer coreserver) {
		this.coreserver = coreserver;
	}

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		// 加入心跳检测 (60 ,20 ,15)读超时时间，写超时时间，读写超时时间
		ch.pipeline().addLast(new IdleStateHandler(60, 0, 0, TimeUnit.SECONDS));
		// ch.pipeline().addLast(new DelimiterBasedFrameDecoder(8192,
		// Delimiters.lineDelimiter()) );
		// ch.pipeline().addLast(new StringDecoder());
		// ch.pipeline().addLast(new StringEncoder());
		ch.pipeline().addLast(new ProtocolDecoder(coreserver));
		ch.pipeline().addLast(new ProtocolEncoder(coreserver));
		ch.pipeline().addLast(new CoreServerHandler(this.coreserver));
	}

}
