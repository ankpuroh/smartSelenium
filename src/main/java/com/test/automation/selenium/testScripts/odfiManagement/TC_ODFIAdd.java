package com.test.automation.selenium.testScripts.odfiManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;

public class TC_ODFIAdd {
	
	public static WebDriver driver=Browser.driver;
	String txtODFIValue = null;
	String xpathODFICode = null;
	String txtCutoffTimeValue = null;
		
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		ODFI_Add.run(4);
		Thread.sleep(2000);
		
		ODFI_Add.run(6);
		Thread.sleep(2000);
		
		driver=Browser.driver;
		txtODFIValue = driver.findElement(By.id("odfiCode")).getAttribute("value");
		xpathODFICode = "xpath:://div[@id='searchResultTable']/table/tbody/tr[*]/td[1]/span[text()='"+txtODFIValue+"']";
		
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode, 1, 3); // XPATH for ODFI Code
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[2]", 1, 4); // XPATH for ODFI Name
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[3]", 1, 5); // XPATH for Company ID
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[4]", 1, 6); // XPATH for Cutoff Time
		ExcelUtil.storeCellData("ODFI_Update", xpathODFICode+"/../../td[5]", 1, 7);	// XPATH for 'View Details' button
		ExcelUtil.storeCellData("ODFI_Update", "text::"+txtODFIValue, 6, 3);
		Thread.sleep(2000);
		
		driver=Browser.driver;
		txtCutoffTimeValue = driver.findElement(By.id("cutoffTime")).getAttribute("value");
		ExcelUtil.storeCellData("ODFI_Update", "text::"+txtCutoffTimeValue, 6, 6);
		Thread.sleep(2000);
		
		ODFI_Add.run(8);
		Thread.sleep(2000);
		
		ODFI_Add.run(10);
		Thread.sleep(2000);
		
		ODFI_Add.run(12);
		Thread.sleep(2000);
		
		}


}

