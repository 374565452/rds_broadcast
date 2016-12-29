package com.cov001.rds.test.other;

import java.util.UUID;

import org.junit.Test;

public class UUIDTest {

	@Test
	public void testUUid() {
		
		for (int i = 0; i < 10; i++) {
			UUID randomUUID = UUID.randomUUID();
			String uuid = randomUUID.toString();
			// System.out.println("len = " + uuid.length());
			System.out.println(uuid);
		}
	}

}
