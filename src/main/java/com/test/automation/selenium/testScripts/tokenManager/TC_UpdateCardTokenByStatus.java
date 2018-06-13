package com.test.automation.selenium.testScripts.tokenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.logResult;

import org.openqa.selenium.Keys;

public class TC_UpdateCardTokenByStatus {
	
public static WebDriver driver=Browser.driver;
public static WebElement txtTokenNumber = null;
	
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		try{
			
			TokenManager_UpdateToken.run(4);
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			txtTokenNumber = driver.findElement(By.id("update_token_number"));
			txtTokenNumber.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			Thread.sleep(2000);
			}
			catch(Exception e){
				logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
			}
			
			TokenManager_UpdateToken.run(6);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(8);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(10);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(12);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(14);
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			txtTokenNumber = driver.findElement(By.id("update_token_number"));
			txtTokenNumber.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			Thread.sleep(2000);
			}
			catch(Exception e){
				logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
			}
			
			TokenManager_UpdateToken.run(6);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(16);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
