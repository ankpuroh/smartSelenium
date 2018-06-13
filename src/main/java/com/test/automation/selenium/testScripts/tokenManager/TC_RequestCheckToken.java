package com.test.automation.selenium.testScripts.tokenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.logResult;

import org.openqa.selenium.Keys;

public class TC_RequestCheckToken {
	
public static WebDriver driver=Browser.driver;
	
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		try{
			
			TokenManager_RequestToken.run(24);
			Thread.sleep(2000);
			
			TokenManager_RequestToken.run(26);
			Thread.sleep(1000);
			
			TokenManager_RequestToken.run(10);
			Thread.sleep(2000);
			
			TokenManager_RequestToken.run(12);
			Thread.sleep(2000);
			
			TokenManager_RequestToken.run(14);
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			WebElement txtTokenNumber = driver.findElement(By.id("cardt_update_card_number"));
			txtTokenNumber.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			Thread.sleep(2000);
			}
			catch(Exception e){
				logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
			}
			
			TokenManager_RequestToken.run(16);
			Thread.sleep(2000);
			
			TokenManager_RequestToken.run(28);
			Thread.sleep(2000);
			
			TokenManager_RequestToken.run(30);
			Thread.sleep(2000);
			
			TokenManager_RequestToken.run(22);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
