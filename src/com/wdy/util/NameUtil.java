package com.wdy.util;

import java.util.Date;

public class NameUtil {
	
	
	public static String getImageName(String method){
		
		return method + "_" + String.valueOf(new Date().getTime()) + ".jpg";
	}
	
	public static String getFolderName(){
		
		return TimeUtil.getDate("yyyyMMdd");
	}
	

}
