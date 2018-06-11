package com.test.automation.selenium.testScripts.loginLogout;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_Logout {
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		
		try{
			
			Logout.run(4);
			Thread.sleep(2000);
			
			Logout.run(6);
			Thread.sleep(2000);
			
			Logout.run(8);
			Thread.sleep(2000);
			
			Browser.Close();
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
