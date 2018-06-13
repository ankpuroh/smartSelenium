package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_CustomerUpdate {
	
public static WebDriver driver=Browser.driver;
	
	String strContractNo = null;
		
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		try{
			
			Recurring_CustomerUpdate.run(4);
			Thread.sleep(2000);
			
			Recurring_CustomerUpdate.run(6);
			Thread.sleep(2000);
			
			Recurring_CustomerUpdate.run(8);
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			strContractNo = driver.findElement(By.id("contractNumber-0")).getAttribute("value");
			ExcelUtil.storeCellData("Recurring_NoticeAdd", strContractNo, 7, 3);
			ExcelUtil.storeCellData("Recurring_NoticeAdd", "text::"+strContractNo, 12, 16);
			ExcelUtil.storeCellData("Recurring_NoticeAdd", "text::"+strContractNo, 14, 16);
			Thread.sleep(2000);
			}
			catch(Exception e){
				logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
			}
			
			Recurring_CustomerUpdate.run(10);
			Thread.sleep(2000);
			
			Recurring_CustomerUpdate.run(4);
			Thread.sleep(2000);
			
			Recurring_CustomerUpdate.run(12);
			Thread.sleep(2000);
			
			Recurring_CustomerUpdate.run(10);
			Thread.sleep(2000);
			
			}catch(Exception ex){
			
		}
		
	}

}
