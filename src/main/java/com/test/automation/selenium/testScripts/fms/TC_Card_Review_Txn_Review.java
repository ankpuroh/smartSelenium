package com.test.automation.selenium.testScripts.fms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;


public class TC_Card_Review_Txn_Review {
	
	public static WebDriver driver=Browser.driver;
	String txtTxnID = null;
				
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		Login.run(BrowserType, 6);
		Thread.sleep(4000);
		
		FMS_Home.run(4);
		Thread.sleep(2000);
		
		FMS_Home.run(6);
		Thread.sleep(2000);
		
		FMS_Home.run(8);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(18);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(6);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(8);
		Thread.sleep(2000);
		
		//******Sale Txn using Card Number****************
		
		FMS_Sale.run(4);
		Thread.sleep(2000);
		
		FMS_Sale.run(6);
		Thread.sleep(2000);
		
		FMS_Sale.run(8);
		Thread.sleep(2000);
		
		FMS_Sale.run(12);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;
		txtTxnID = driver.findElement(By.id("transaction_id")).getText();
		ExcelUtil.storeCellData("FMS_Home", "xpath:://span[text()='"+txtTxnID+"']/../../td[5]/span", 1, 9);
		Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		VTDownloadPrint.run(12);
		Thread.sleep(2000);		
		
		//***********************************
		
		FMS_Home.run(4);
		Thread.sleep(30000);
		
		FMS_Home.run(16);
		Thread.sleep(2000);
		
		FMS_Home.run(18);
		Thread.sleep(2000);
		
		FMS_Home.run(14);
		Thread.sleep(2000);
		
		FMS_Home.run(8);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(12);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(14);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(16);
		Thread.sleep(2000);
		
		FMS_CardNumber.run(8);
		Thread.sleep(2000);
		
		Logout.run(4);
		Thread.sleep(2000);
		
		Logout.run(6);
		Thread.sleep(2000);
		
		Logout.run(8);
		Thread.sleep(2000);
		
		Browser.Close();
		
		}


}

