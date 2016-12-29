package com.cov001.rds.core.session.protocol;

public class ProtocolMsg {

	private byte header;
	
	private byte tail;
	
	private short command;
	
	private short dataLen;
	
	private byte[] data;

	public ProtocolMsg(){
		
	}
	
	public ProtocolMsg(byte header,byte tail,short command,short dataLen,byte[] data){
		this.header=header;
		this.tail=tail;
		this.command=command;
		this.dataLen=dataLen;
		this.data=data;
	}
	
	public byte getHeader() {
		return header;
	}

	public void setHeader(byte header) {
		this.header = header;
	}

	public byte getTail() {
		return tail;
	}

	public void setTail(byte tail) {
		this.tail = tail;
	}

	public short getCommand() {
		return command;
	}

	public void setCommand(short command) {
		this.command = command;
	}

	public short getDataLen() {
		return dataLen;
	}

	public void setDataLen(short dataLen) {
		this.dataLen = dataLen;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	
	
}
