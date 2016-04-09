package com.ppp.util;

import java.util.UUID;

public class UtilityFunctions {
	public static String generateRandomHash() {
		return UUID.randomUUID().toString();
		}
}
