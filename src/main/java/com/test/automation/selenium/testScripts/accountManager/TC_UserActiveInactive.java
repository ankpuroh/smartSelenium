package com.test.automation.selenium.testScripts.accountManager;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_UserActiveInactive {
	
public static WebDriver driver=Browser.driver;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
			
		try{
			
			AccountManager_UserUpdate.run(16);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(18);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(20);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(22);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(24);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(18);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(20);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(22);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(16);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
		//Logout.run(4);
				
	 }

}
