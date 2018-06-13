package com.test.automation.selenium.testScripts.odfiManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

import org.openqa.selenium.Keys;

public class TC_ODFIUpdate {
	
	public static WebDriver driver=Browser.driver;
	String txtODFIValue = null;
	String xpathODFICode = null;
	String txtCutoffTimeValue = null;
		
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		ODFI_Update.run(4);
		Thread.sleep(2000);
		
		ODFI_Update.run(20);
		Thread.sleep(2000);
		
		ODFI_Update.run(6);
		Thread.sleep(2000);
		
		ODFI_Update.run(8);
		Thread.sleep(2000);
		
		ODFI_Update.run(10);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;		
		WebElement cutoffTime = driver.findElement(By.id("cutoffTime"));
		cutoffTime.sendKeys(Keys.ARROW_UP);
		Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		ODFI_Update.run(12);
		Thread.sleep(2000);
		
		ODFI_Update.run(14);
		Thread.sleep(2000);
		
		ODFI_Update.run(16);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;
		txtODFIValue = driver.findElement(By.id("odfiCode")).getAttribute("value");
		xpathODFICode = "xpath:://div[@id='searchResultTable']/table/tbody/tr[*]/td[1]/span[text()='"+txtODFIValue+"']";
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode, 1, 3); // XPATH for ODFI Code
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[2]", 1, 4); // XPATH for ODFI Name
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[3]", 1, 5); // XPATH for Company ID
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[4]", 1, 6); // XPATH for Cutoff Time
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[5]", 1, 7);	// XPATH for 'View Details' button
		ExcelUtil.storeCellData("ODFI_Update", "text::"+txtODFIValue, 18, 3);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;
		txtCutoffTimeValue = driver.findElement(By.id("cutoffTime")).getAttribute("value");
		ExcelUtil.storeCellData("ODFI_Update", "text::"+txtCutoffTimeValue, 18, 6);
		Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		ODFI_Update.run(4);
		Thread.sleep(2000);
		
		ODFI_Update.run(20);
		Thread.sleep(2000);
		
		ODFI_Update.run(18);
		Thread.sleep(2000);
		
		}

}

