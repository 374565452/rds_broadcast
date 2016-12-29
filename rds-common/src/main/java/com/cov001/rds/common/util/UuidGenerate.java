package com.cov001.rds.common.util;

import java.util.UUID;

public class UuidGenerate {

	public static String getUuid(){
		UUID randomUUID = UUID.randomUUID();
		String uuid = randomUUID.toString();
		return uuid;
	}
	
}
