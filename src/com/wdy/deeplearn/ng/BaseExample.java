package com.wdy.deeplearn.ng;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public abstract class BaseExample {
    protected ExtentReports extent;
    protected ExtentTest test;
    
    final String filePath = "extent_report.html";

    @AfterMethod
    protected void afterMethod(ITestResult result) {
      
        extent.flush();
    }
    
    @BeforeSuite
    public void beforeSuite() {
        extent = ExtentManager.getReporter(filePath);
    }
    
    @AfterSuite
    protected void afterSuite() {
        extent.close();
    }
}