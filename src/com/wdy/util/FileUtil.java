package com.wdy.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.wdy.deeplearn.ng.LogUtil;

public class FileUtil {
	
	
	public static void createPath(String path){
		
		File dir = new File(path);
		if (!dir.exists()){
			dir.mkdirs();
			LogUtil.info("Create Path : " + path + "");
		}else{
			LogUtil.info("Exist path: " + path + "");
		}
		
	}
	
	public static void writeFile(String filePath, String message, boolean isOverwrite){

		FileWriter fileWriter;
		try {
			
			fileWriter = new FileWriter(filePath,isOverwrite);
			fileWriter.write(message);
			fileWriter.flush();
			fileWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			LogUtil.error("Write to Path " + filePath);
		}
		
	}
	
	public static String getAbsolutePath(String path, String fileName){
		
		File dir = new File(path);
		String filePath = dir.getAbsolutePath() + File.separator + fileName;
		return filePath;
	}
	
	public static String getAbsolutePath(String path){
		File dir = new File(path);
		String filePath = dir.getAbsolutePath();
		return filePath;
	}

}
