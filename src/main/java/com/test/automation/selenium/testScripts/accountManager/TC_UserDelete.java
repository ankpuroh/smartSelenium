package com.test.automation.selenium.testScripts.accountManager;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_UserDelete {
	
public static WebDriver driver=Browser.driver;
	
	//String delUserSQL = null;
		
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		
		try{
			
			AccountManager_UserDelete.run(4);
			Thread.sleep(2000);
			
			AccountManager_UserDelete.run(6);
			Thread.sleep(2000);
			
			AccountManager_UserDelete.run(8);
			Thread.sleep(2000);
			
			AccountManager_UserDelete.run(10);
			Thread.sleep(2000);
			
			AccountManager_UserDelete.run(12);
			Thread.sleep(2000);
			
			AccountManager_UserDelete.run(14);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
