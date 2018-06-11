package com.test.automation.selenium.testScripts.tokenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

import org.openqa.selenium.Keys;

public class TC_UpdateCheckToken {
	
public static WebDriver driver=Browser.driver;
	
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		try{
			
			TokenManager_UpdateToken.run(4);
			Thread.sleep(2000);
			
			driver=Browser.driver;
			WebElement txtTokenNumber = driver.findElement(By.id("update_token_number"));
			txtTokenNumber.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			Thread.sleep(2000);
			
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
			
			driver=Browser.driver;
			txtTokenNumber = driver.findElement(By.id("update_token_number"));
			txtTokenNumber.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(6);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(16);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
