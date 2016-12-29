package com.cov001.rds.core.codec;

import java.util.List;

import com.cov001.rds.core.CoreServer;
import com.cov001.rds.core.session.protocol.ProtocolConst;
import com.cov001.rds.core.session.protocol.ProtocolMsg;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class ProtocolDecoder extends ByteToMessageDecoder {

	private CoreServer coreServer;
	
	public ProtocolDecoder(CoreServer coreServer) {
		this.coreServer=coreServer;
	}
	
	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		int size = in.readableBytes();
		if (size < 6) {
			return;
		}
		try {
			byte header = in.readByte();
			if (header == ProtocolConst.PROTOCOLHeader) {
				short command = in.readShort();
				short len = in.readShort();
				if ((size - 6) >= len) {
					byte[] buffer = new byte[len];
					in.readBytes(buffer, 0, len);
					byte tail = in.readByte();
					ProtocolMsg msg=new ProtocolMsg(header, tail, command, len, buffer);
					out.add(msg);
				} else { //收到的数据长度不对，数据没有接收正确
					in.resetReaderIndex();//直接删除此次接收的数据包
					return;
				}
			} else {
				in.resetReaderIndex(); // 接收到的头不对，直接删除此次收到的数据包
				return;
			}
		} catch (Exception e) {
			in.resetReaderIndex();
		}

	}

}
