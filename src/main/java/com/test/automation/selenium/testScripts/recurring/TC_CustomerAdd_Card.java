package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_CustomerAdd_Card {
	
public static WebDriver driver=Browser.driver;
String txtCustNo = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		try{
			
			Recurring_CustomerAdd.run(4);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(6);
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			txtCustNo = driver.findElement(By.id("customerNumber")).getAttribute("value");
			ExcelUtil.storeCellData("Recurring_CustomerAdd", "text::"+txtCustNo, 20, 68);
			ExcelUtil.storeCellData("Recurring_CustomerUpdate", txtCustNo, 3, 1);
			Thread.sleep(2000);
			}
			catch(Exception e){
				logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
			}
			
			Recurring_CustomerAdd.run(12);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(14);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(16);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(18);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(20);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(26);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
