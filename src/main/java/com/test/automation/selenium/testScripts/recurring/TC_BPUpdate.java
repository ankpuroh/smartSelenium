package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_BPUpdate {
	
public static WebDriver driver=Browser.driver;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		try{
			
			Recurring_BPUpdate.run(4);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(6);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(8);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(10);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(12);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(14);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(16);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(18);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(20);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(4);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(8);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(22);
			Thread.sleep(2000);
			
			Recurring_BPUpdate.run(18);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
