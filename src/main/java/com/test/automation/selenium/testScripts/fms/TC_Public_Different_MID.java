package com.test.automation.selenium.testScripts.fms;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.logResult;


public class TC_Public_Different_MID {
	
	public static WebDriver driver=Browser.driver;
					
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		Login.run(BrowserType, 6);
		Thread.sleep(4000);
		
		FMS_Home.run(4);
		Thread.sleep(2000);
		
		FMS_Home.run(6);
		Thread.sleep(2000);
		
		FMS_Home.run(8);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(30);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(6);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(8);
		Thread.sleep(2000);
		
		//********************************************************************************************
		
		logResult.logTest("Test Execution", "Status", "INFO", "In Mother MID - My List", "", "");
		
		FMS_CardNumber.run(32);
		Thread.sleep(2000);
		
		//********************************************************************************************
		
		logResult.logTest("Test Execution", "Status", "INFO", "In Mother MID - Global List", "", "");
		
		FMS_CardNumber.run(12);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(32);
		Thread.sleep(2000);
		
		//********************************************************************************************
		
		logResult.logTest("Test Execution", "Status", "INFO", "In Other MID - My List", "", "");
		
		FMS_Home.run(20);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(14);
		Thread.sleep(2000);
		
		//********************************************************************************************
		
		logResult.logTest("Test Execution", "Status", "INFO", "In Other MID - Global List", "", "");
		
		FMS_CardNumber.run(12);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(32);
		Thread.sleep(2000);
		
		//*********************************************************************************************
		
		logResult.logTest("Test Execution", "Status", "INFO", "In Other MID - Global List - Save the Card", "", "");
		
		FMS_CardNumber.run(36);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(18);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(6);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(8);
		Thread.sleep(2000);
		
		//*********************************************************************************************
		
		logResult.logTest("Test Execution", "Status", "INFO", "In Other MID - My List", "", "");
		
		FMS_CardNumber.run(34);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(24);
		Thread.sleep(2000);
		
		//*********************************************************************************************
		
		FMS_CardNumber.run(16);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(18);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(20);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(8);
		Thread.sleep(2000);
		
		FMS_Home.run(6);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(16);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(18);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(20);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(8);
		Thread.sleep(2000);
		
		Logout.run(4);
		Thread.sleep(2000);
		
		Logout.run(6);
		Thread.sleep(2000);
		
		Logout.run(8);
		Thread.sleep(2000);
		
		Browser.Close();
		
		}


}

