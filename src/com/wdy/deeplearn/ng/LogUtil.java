package com.wdy.deeplearn.ng;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LogUtil {
	
	
	public static ExtentTest test;
	
	public static void setTest(ExtentTest et){
		
		test = et;
	}
	
	
	public static void step(String...message){
		
		if(message.length == 1){
			test.log(LogStatus.INFO, message[0]);
		}
		else{
			test.log(LogStatus.INFO, message[1], message[0]);
		}
		
	}
	
	public static void error(String...message){
		if(message.length == 1){
			test.log(LogStatus.ERROR, message[0]);
		}
		else{
			test.log(LogStatus.ERROR, message[1], message[0]);
		}
	}
	
	public static void info(String...message){
		if(message.length == 1){
			test.log(LogStatus.INFO, message[0]);
		}
		else{
			test.log(LogStatus.INFO, message[1], message[0]);
		}
	}

}
