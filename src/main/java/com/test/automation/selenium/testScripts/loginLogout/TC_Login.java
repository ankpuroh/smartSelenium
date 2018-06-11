package com.test.automation.selenium.testScripts.loginLogout;

import com.test.automation.selenium.businesscomponents.*;

public class TC_Login {
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		Login.run(BrowserType, 6);
		Thread.sleep(4000);
		
	}

}
