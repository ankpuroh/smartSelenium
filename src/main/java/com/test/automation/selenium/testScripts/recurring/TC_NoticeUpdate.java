package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_NoticeUpdate {
	
public static WebDriver driver=Browser.driver;
	
	String strContractNo = null;
	/*String delBPSQL = null;
	String delContractSQL = null;
	String delCustomerSQL = null;*/
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		
		try{
			
			Recurring_NoticeUpdate.run(4);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(6);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(8);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(10);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(12);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(14);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(16);
			Thread.sleep(2000);
			
			Recurring_NoticeAdd.run(14);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(4);
			Thread.sleep(2000);
			
			Recurring_NoticeUpdate.run(18);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
