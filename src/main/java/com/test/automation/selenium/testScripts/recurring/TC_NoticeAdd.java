package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_NoticeAdd {
	
public static WebDriver driver=Browser.driver;
	
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		try{
			
			Recurring_NoticeAdd.run(4);
			Thread.sleep(2000);
			
			Recurring_NoticeAdd.run(6);
			Thread.sleep(2000);
			
			Recurring_NoticeAdd.run(8);
			Thread.sleep(2000);
			
			Recurring_NoticeAdd.run(10);
			Thread.sleep(2000);
			
			Recurring_NoticeAdd.run(16);
			Thread.sleep(2000);
			
			Recurring_NoticeAdd.run(12);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
