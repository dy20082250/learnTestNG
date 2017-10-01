package com.wdy.deeplearn.ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestngListener2.class)
public class SingleLogTest extends BaseExample{
	
    @Test
    public void passTest() {
        
    		FrameAssertion.equals(1, 1, "比较二者是否相同");
    		FrameAssertion.equals(1, 1, "比较二者是否相同");
    		FrameAssertion.equals(1, 1, "比较二者是否相同");
    }
    
    @Test
    public void intentionalFailure() throws Exception {
       
        throw new Exception("intentional failure");        
    }
    
    
    @Test
    public void test_1(){
    	
    		int  b = 1 + 1;
    		FrameAssertion.equals(b, 2, "比较二者是否相同");
    	
    }    
    @Test
    public void testMethod(){
    	
    WebDriver driver;
    	driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    
    driver.navigate().to("https://www.baidu.com/");
    
    driver.manage().window().maximize();
    
    String title = driver.getTitle();
    
    FrameAssertion.equals(title, "something new", "for popuse to fail");
    	
    	
    }
    
    
    
}