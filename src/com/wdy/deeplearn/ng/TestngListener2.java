package com.wdy.deeplearn.ng;

import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestngListener2 extends TestListenerAdapter {
    private Logger logger = Logger.getLogger(TestngListener2.class);
    protected ExtentReports extent;
    protected ExtentTest test;
    
    final String filePath = "extent_report.html";
    
    	@Override
    	public void onStart(ITestContext testContext) {
    		System.out.println("----------------------------------------" );
    		System.out.println("Start to run " + testContext.getName());
    		System.out.println("----------------------------------------" );
    		extent = ExtentManager.getReporter(filePath);
    	}
    	
    
    
    @Override
    public void onTestStart(ITestResult tr) {
        super.onTestStart(tr);
        logger.info("【" + tr.getName() + " Start】");
        test= extent.startTest(tr.getName());
        LogUtil.setTest(test);
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        
        String img = new ScreenShot().takeScreenShot(new FirefoxDriver(), tr.getName());
        logger.info("【" + tr.getName() + " Failure】");
        test.log(LogStatus.FAIL, tr.getThrowable());
        test.addScreenCapture(img);
        extent.endTest(test);
        
    }
    
    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
        logger.info("【" + tr.getName() + " Skipped】");
        test.log(LogStatus.SKIP, "SKIP");
        extent.endTest(test);
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        logger.info("【" + tr.getName() + " Success】");
        test.log(LogStatus.PASS, "Pass");
        extent.endTest(test);
    }

    @Override
    public void onFinish(ITestContext testContext) {
        super.onFinish(testContext);
    }
}