package com.test.automation.selenium.testScripts.merchantBoarding;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_MerchantActiveInactive {
	
	public static WebDriver driver=Browser.driver;
	//String delMIDSQL = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		
		MerchantBoarding_MerchantUpdate.run(18);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(20);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(22);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(24);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(26);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(20);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantSearch.run(22);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(24);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantUpdate.run(18);
		Thread.sleep(2000);
		
	}


}

