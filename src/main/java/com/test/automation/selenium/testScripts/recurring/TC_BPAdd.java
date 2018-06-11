package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;

public class TC_BPAdd {
	
public static WebDriver driver=Browser.driver;
String txtBP = null;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
			
		try{
			
			Recurring_BPAdd.run(4);
			Thread.sleep(2000);
			
			Recurring_BPAdd.run(6);
			Thread.sleep(2000);
			
			Recurring_BPAdd.run(8);
			Thread.sleep(2000);
			
			Recurring_BPAdd.run(10);
			Thread.sleep(2000);
			
			driver=Browser.driver;
			txtBP = driver.findElement(By.id("billingPlan")).getAttribute("value");
			ExcelUtil.storeCellData("Recurring_BPUpdate", txtBP, 3, 1);
			Thread.sleep(2000);
			
			Recurring_BPAdd.run(12);
			Thread.sleep(2000);
			
			Recurring_BPAdd.run(14);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
