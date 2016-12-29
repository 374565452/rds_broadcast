package com.cov001.rds.core.session.protocol;

public class ProtocolConst {

	public static  byte PROTOCOLHeader = (byte) 0xAA;
	
	public static byte PROTOCOLTAIL=(byte)0x55;
	
	public static short REGISTERCOMMAND=0x0101;
	
	public static short HEARTBEATSCOMMAND=0x0102;
	
	public static short STARTBROADCASTCOMMAND=0x0042;
	
	public static short BROADCASTFILECOMMAND=0x0041;
	
}
