package com.wdy.deeplearn.ng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.wdy.util.FileUtil;
import com.wdy.util.NameUtil;


public class ScreenShot {
	
	private String getImagePath(String imageName){
		String path = "frame-output/report/snapshot" + "/" + NameUtil.getFolderName();
		FileUtil.createPath(path);
		path = FileUtil.getAbsolutePath(path + "/" + imageName);
		return path;
	}
	
	public String takeScreenShot(WebDriver driver, String method){
		if (driver == null) {
			return null;
		}
		String imageName = NameUtil.getImageName(method);
		String path = getImagePath(imageName);
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(path));
			LogUtil.info("Screen shot be taken: " + path);
		} catch (IOException e) {
			LogUtil.error("Screen shot error: " + path);
		}
		return imageName;
	}


}
