package com.cov001.rds.core.codec;

import com.cov001.rds.core.CoreServer;
import com.cov001.rds.core.session.protocol.ProtocolMsg;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ProtocolEncoder extends MessageToByteEncoder<ProtocolMsg>{

	private CoreServer coreServer;
	
	public ProtocolEncoder(CoreServer coreServer){
		this.coreServer=coreServer;
	}
	
	@Override
	protected void encode(ChannelHandlerContext ctx, ProtocolMsg msg, ByteBuf out) throws Exception {
		if (msg == null) {
			throw new Exception("The encode message is null");
		}
		out.writeByte(msg.getHeader());
		out.writeShort(msg.getCommand());
		out.writeShort(msg.getDataLen());
		out.writeBytes(msg.getData());
		out.writeByte(msg.getTail());
		
		//int size=out.capacity();
		//System.out.println("the capacity is ==== "+size);
	}

}
