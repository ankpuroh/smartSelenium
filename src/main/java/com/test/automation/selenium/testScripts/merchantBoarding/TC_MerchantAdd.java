package com.test.automation.selenium.testScripts.merchantBoarding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;


public class TC_MerchantAdd {
	
	public static WebDriver driver=Browser.driver;
	String txtMID = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		MerchantBoarding_MerchantAdd.run(4);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(6);
		Thread.sleep(2000);
		
		driver=Browser.driver;
		txtMID = driver.findElement(By.id("mid")).getAttribute("value");
		ExcelUtil.storeCellData("MerchantBoarding_MerchantSearch", txtMID, 5, 3);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(8);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(10);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(12);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(14);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(16);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(18);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(20);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(22);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(24);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(26);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(28);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(30);
		Thread.sleep(2000);
		
		MerchantBoarding_MerchantAdd.run(32);
		Thread.sleep(2000);
		
		}


}

