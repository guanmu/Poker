package com.guanmu.resouses;

import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.Logger;

import com.guanmu.log.CardLoggers;

/**
 * 国际化封装类
 * @author wangquan
 *
 */
public class Message {
	
	public static final String DEFUALT = "***";
	private static final String CLASS_RESOURCE_PATH = "com/guanmu/resouses/message";
	private static ResourceBundle rb = ResourceBundle.getBundle(CLASS_RESOURCE_PATH, Locale.CHINESE);
	
	private static final Logger logger = CardLoggers.getLog(Message.class.getName());
	
	public static void setLocale(Locale locale) {
		try {
			rb = ResourceBundle.getBundle(CLASS_RESOURCE_PATH, locale);
		} catch (Exception e) {
			rb = ResourceBundle.getBundle(CLASS_RESOURCE_PATH, Locale.ENGLISH);
		}
	}

	/**
	 * 根据Key值获取字符串
	 * @param key
	 * @return
	 */
	public static String getString(String key) {
		if(key == null){
			logger.error("the key is null.");
			return DEFUALT;
		}
		try{
			String value = rb.getString(key);
			return transformEncode(value);
		}catch(Exception e){
			logger.error("get string exception.",e);
			return DEFUALT;
		}
	}
	
	

	/**
	 * 将字符串转换成相应编码
	 * 
	 * @param key
	 * @return
	 */
	public static String transformEncode(String key) {
		if(key == null){
			return DEFUALT;
		}
		try {
			String keyValue = new String(key.getBytes("ISO-8859-1"), "UTF-8");
			return keyValue;
		} catch (Exception e) {
			logger.error("key transform exception.",e);
			return DEFUALT;
		}
	}
	
	public static void main(String[] args) {
		String str = Message.getString("test");
		System.out.println(str);
	}
}
