package com.test.automation.selenium.testScripts.merchantBoarding;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_MerchantUpdate {
	
	public static WebDriver driver=Browser.driver;
	String delMIDSQL = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		MerchantBoarding_MerchantUpdate.run(4);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(6);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(8);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(10);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(12);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(14);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantSearch.run(6);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(16);
		Thread.sleep(2000);
		
	}


}

