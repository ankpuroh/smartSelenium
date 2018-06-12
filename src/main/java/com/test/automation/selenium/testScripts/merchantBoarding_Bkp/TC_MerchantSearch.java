package com.test.automation.selenium.testScripts.merchantBoarding;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_MerchantSearch {
	
	public static WebDriver driver=Browser.driver;
	String delMIDSQL = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
			
		MerchantBoarding_MerchantSearch.run(4);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantSearch.run(6);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantSearch.run(8);
		Thread.sleep(2000);
		
		}


}

