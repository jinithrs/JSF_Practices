package com.ppp.util;

import java.util.UUID;

public class Utility{
	
	
	public static String generateRandomHash() {
		return UUID.randomUUID().toString();
	}
	
	public static String stackTracetoString(Throwable exception){
		StringBuilder sb = new StringBuilder();
	    for (StackTraceElement element : exception.getStackTrace()) {
	        sb.append(element.toString());
	        sb.append("\n");
	    }
	    return sb.toString();
	}
}
