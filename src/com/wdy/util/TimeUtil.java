package com.wdy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
	
	
	public static String getDate(String format){
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String nowDate = sdf.format(date);
		return nowDate;
		
	}
	
	
	public static String getDate(){
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nowDate = sdf.format(date);
		return nowDate;
		
	}
	
	public static String getTimeForFile(){
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowTime = sdf.format(date);
		return nowTime;
		
	}
	
	public static String getTimeMs(){
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String nowTimeMs = sdf.format(date);
		return nowTimeMs;
	}
	
	

}
