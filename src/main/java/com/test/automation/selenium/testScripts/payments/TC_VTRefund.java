package com.test.automation.selenium.testScripts.payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_VTRefund {
	
	public static WebDriver driver=Browser.driver;
	String txtTxnID = null;
	String txtAmount = null;
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		Login.run(BrowserType, 6);
		Thread.sleep(4000);
		
		VTSale.run(4);
		Thread.sleep(2000);
		
		VTSale.run(6);
		Thread.sleep(2000);
		
		VTSale.run(8);
		Thread.sleep(2000);
		
		VTSale.run(10);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;
		txtTxnID = driver.findElement(By.id("transaction_id")).getText();
		Thread.sleep(2000);
		ExcelUtil.storeCellData("Payments_VTRefund", txtTxnID, 5, 2);
		ExcelUtil.storeCellData("Payments_VTRefund", "text::"+txtTxnID, 10, 4);
		Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		VTDownloadPrint.run(12);
		Thread.sleep(2000);
		
		VTRefund.run(4);
		Thread.sleep(2000);
		
		VTRefund.run(6);
		Thread.sleep(2000);
		
		VTRefund.run(8);
		Thread.sleep(2000);
		
		VTRefund.run(10);
		Thread.sleep(2000);
		
		VTRefund.run(12);
		Thread.sleep(2000);
		
		VTRefund.run(14);
		Thread.sleep(2000);
		
		VTRefund.run(8);
		Thread.sleep(2000);
		
		try{
			driver=Browser.driver;
			txtTxnID = driver.findElement(By.id("transaction_id")).getText();
			ExcelUtil.storeCellData("Payments_VTRefund", txtTxnID, 5, 2);
			ExcelUtil.storeCellData("Payments_VTRefund", "text::"+txtTxnID, 16, 10);
			ExcelUtil.storeCellData("Payments_VTRefund", "text::"+txtTxnID, 20, 4);
			ExcelUtil.storeCellData("Payments_Reports", txtTxnID, 5, 6);
			Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		VTRefund.run(16);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(8);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(10);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(12);
		Thread.sleep(2000);
		
		VTRefund.run(18);
		Thread.sleep(2000);
		
		VTRefund.run(6);
		Thread.sleep(2000);
		
		VTRefund.run(8);
		Thread.sleep(2000);
		
		VTRefund.run(20);
		Thread.sleep(2000);
		
		Reports_CardReports.run(4);
		Thread.sleep(2000);
		
		Reports_CardReports.run(6);
		Thread.sleep(2000);
		
		Reports_CardReports.run(8);
		Thread.sleep(2000);
		
		logResult.logTest("Test Execution", "Status", "INFO", "Verifying Data in the Report", "", "");
		
		Reports_CardReports.run(22);
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

