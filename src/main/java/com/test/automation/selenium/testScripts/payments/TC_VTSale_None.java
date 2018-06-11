package com.test.automation.selenium.testScripts.payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_VTSale_None {
	
	public static WebDriver driver=Browser.driver;
	String txtTxnID = null;
			
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
		
		driver=Browser.driver;
		txtTxnID = driver.findElement(By.id("transaction_id")).getText();
		ExcelUtil.storeCellData("Payments_VTSale", "text::"+txtTxnID, 12, 38);
		ExcelUtil.storeCellData("Payments_Reports", txtTxnID, 5, 6);
		Thread.sleep(2000);
		
		VTSale.run(12);
		Thread.sleep(2000);
		
		/*VTSaleDownloadPrint.run(4);
		Thread.sleep(2000);
		
		driver=Browser.driver;
		driver.close();
		Thread.sleep(2000);*/
		
		VTDownloadPrint.run(8);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(10);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(12);
		Thread.sleep(2000);
		
		Reports_CardReports.run(4);
		Thread.sleep(2000);
		
		Reports_CardReports.run(6);
		Thread.sleep(2000);
		
		Reports_CardReports.run(8);
		Thread.sleep(2000);
		
		logResult.logTest("Test Execution", "Status", "INFO", "Verifying Data in the Report", "", "");
		
		Reports_CardReports.run(14);
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

