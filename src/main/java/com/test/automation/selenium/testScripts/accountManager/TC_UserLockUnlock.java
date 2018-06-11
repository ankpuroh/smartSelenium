package com.test.automation.selenium.testScripts.accountManager;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_UserLockUnlock {
	
public static WebDriver driver=Browser.driver;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
			
		try{
			
			AccountManager_UserUpdate.run(26);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(28);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(30);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(32);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(34);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(28);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(30);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(32);
			Thread.sleep(2000);
			
			AccountManager_UserUpdate.run(26);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
		//Logout.run(4);
				
	 }

}
