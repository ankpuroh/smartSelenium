package com.test.automation.selenium.testScripts.tokenManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.logResult;

public class TC_UpdateCardTokenByExpDate {
	
public static WebDriver driver=Browser.driver;
	
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		try{
			
			TokenManager_UpdateToken.run(52); //Temporary; To be deleted
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(18);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(20); 
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(22); 
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(24); 
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(26); 
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(12); 
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(14); 
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			WebElement txtTokenNumber = driver.findElement(By.id("update_token_number"));
			txtTokenNumber.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			Thread.sleep(2000);
			}
			catch(Exception e){
				logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
			}
			
			TokenManager_UpdateToken.run(6);
			Thread.sleep(2000);
			
			TokenManager_UpdateToken.run(28);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
