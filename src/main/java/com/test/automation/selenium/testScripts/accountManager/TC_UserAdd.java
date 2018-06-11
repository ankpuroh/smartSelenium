package com.test.automation.selenium.testScripts.accountManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;

public class TC_UserAdd {
	
public static WebDriver driver=Browser.driver;
String txtUsername = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		try{
			
			AccountManager_UserAdd.run(4);
			Thread.sleep(2000);
			
			driver=Browser.driver;
			txtUsername = driver.findElement(By.id("userName")).getAttribute("value");
			ExcelUtil.storeCellData("AccountManager_UserSearch", txtUsername, 5, 3);
			Thread.sleep(2000);
			
			AccountManager_UserAdd.run(6);
			Thread.sleep(2000);
			
			AccountManager_UserAdd.run(8);
			Thread.sleep(2000);
			
			AccountManager_UserAdd.run(10);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
