package com.test.automation.selenium.testScripts.accountManager;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_UserSearch {
	
public static WebDriver driver=Browser.driver;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
			
		try{
			
			AccountManager_UserSearch.run(6);
			Thread.sleep(2000);
			
			AccountManager_UserSearch.run(8);
			Thread.sleep(2000);
			
			AccountManager_UserSearch.run(10);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
		//Logout.run(4);
				
	 }

}
