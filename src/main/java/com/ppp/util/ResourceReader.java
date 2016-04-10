package com.ppp.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ResourceReader {
	private Properties prop;
	private InputStream stream;
	private Logger logger= LoggerFactory.getLogger(ResourceReader.class);
	
	private ResourceReader(){};
	public ResourceReader(String fileName){
		
		prop=new Properties();
		stream=getClass().getClassLoader().getResourceAsStream(fileName);
		try {
			prop.load(stream);
		} catch(Exception ex){
			logger.info("Exception while  reading property file [{}]",fileName);
			logger.error(Utility.stackTracetoString(ex));
		}
		finally{
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					logger.error(Utility.stackTracetoString(e));
				}
			}
		}
	}
	
	public String getValue(String key){
		return prop.getProperty(key);
	}
}
