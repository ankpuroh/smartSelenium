package com.test.automation.selenium.testScripts.payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_VTCaptureAdjust_Auth {
	
	public static WebDriver driver=Browser.driver;
	String txtTxnID = null;
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		Login.run(BrowserType, 6);
		Thread.sleep(4000);
		
		VTAuth.run(4);
		Thread.sleep(2000);
		
		VTAuth.run(6);
		Thread.sleep(2000);
		
		VTAuth.run(8);
		Thread.sleep(2000);
		
		VTAuth.run(10);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;
		txtTxnID = driver.findElement(By.id("transaction_id")).getText();
		ExcelUtil.storeCellData("Payments_VTCaptureAdjust", txtTxnID, 5, 2);
		ExcelUtil.storeCellData("Payments_VTCaptureAdjust", "valueattribute::"+txtTxnID, 10, 4);
		ExcelUtil.storeCellData("Payments_VTCaptureAdjust", "text::"+txtTxnID, 16, 14);
		ExcelUtil.storeCellData("Payments_VTCaptureAdjust", "text::"+txtTxnID, 18, 14);
		ExcelUtil.storeCellData("Payments_VTCaptureAdjust", "text::"+txtTxnID, 20, 14);
		ExcelUtil.storeCellData("Payments_Reports", txtTxnID, 5, 6);
		Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}		
		
		VTCaptureAdjust.run(16);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(12);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(4);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(6);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(8);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(10);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(12);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(8);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(18);
		Thread.sleep(2000);
		
		VTDownloadPrint.run(12);
		Thread.sleep(2000);
		
		Reports_CardReports.run(4);
		Thread.sleep(2000);
		
		Reports_CardReports.run(6);
		Thread.sleep(2000);
		
		Reports_CardReports.run(8);
		Thread.sleep(2000);
		
		logResult.logTest("Test Execution", "Status", "INFO", "Verifying Data in the Report for Capture", "", "");
		
		Reports_CardReports.run(16);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(4);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(6);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(8);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(10);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(14);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(8);
		Thread.sleep(2000);
		
		VTCaptureAdjust.run(20);
		Thread.sleep(2000);
		
		/*VTDownloadPrint.run(8);
		Thread.sleep(2000);*/
		
		VTDownloadPrint.run(12);
		Thread.sleep(4000);
		
		Reports_CardReports.run(28);
		Thread.sleep(2000);
		
		Reports_CardReports.run(6);
		Thread.sleep(2000);
		
		Reports_CardReports.run(8);
		Thread.sleep(2000);
		
		logResult.logTest("Test Execution", "Status", "INFO", "Verifying Data in the Report for Adjust", "", "");
		
		Reports_CardReports.run(18);
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

