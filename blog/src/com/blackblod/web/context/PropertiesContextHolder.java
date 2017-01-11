package com.blackblod.web.context;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertiesContextHolder extends PropertyPlaceholderConfigurer{

	private static Properties properties = new Properties();
	
	@SuppressWarnings("rawtypes")
	public void init() throws IOException {
		properties = mergeProperties();
		
		//同步分到系统变量中去
		Iterator it = properties.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry entry = (Map.Entry) it.next();
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			System.setProperty(key, value);
		}
	}
	
	public static String getProperty(String key){
		String property = properties.getProperty(key);
		//如果自定义property找不到，从系统变量中找
		if(StringUtils.isEmpty(property)){
			property = System.getProperty(key);
		}
		return property;
	}
	
	public static boolean isProduction() {
		if (StringUtils.equalsIgnoreCase("true", getProperty("environment"))) {
			return true;
		}
		return false;
	}

}
