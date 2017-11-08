package com.guanmu.resouses;

import java.util.Locale;
import java.util.ResourceBundle;

public class Message {
	
	private static final String CLASS_RESOURCE_PATH = "com/guanmu/resouses/message";
	public static final String DEFUALT = "***";
	private static ResourceBundle rb = ResourceBundle.getBundle(CLASS_RESOURCE_PATH, Locale.CHINESE);

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
			return DEFUALT;
		}
		try{
			String value = rb.getString(key);
			return getProString(value);
		}catch(Exception e){
			e.printStackTrace();
			return DEFUALT;
		}
	}
	
	

	/**
	 * 将字符串转换成相应编码
	 * 
	 * @param key
	 * @return
	 */
	public static String getProString(String key) {
		if(key == null){
			return DEFUALT;
		}
		try {
			String keyValue = new String(key.getBytes("ISO-8859-1"), "UTF-8");
			if(null == keyValue){
				keyValue=DEFUALT;
			}
			return keyValue;
		} catch (Exception e) {
			return DEFUALT;
		}
	}
	
	public static void main(String[] args) {
		String str = Message.getString("test");
		System.out.println(str);
	}
}
