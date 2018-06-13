package com.test.automation.selenium.testScripts.payments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_VTForceCapture_Level2 {
	
	public static WebDriver driver=Browser.driver;
	String txtTxnID = null;
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		
		Login.run(BrowserType, 6);
		Thread.sleep(4000);
		
		VTForceCapture.run(4);
		Thread.sleep(2000);
		
		VTForceCapture.run(6);
		Thread.sleep(2000);
		
		VTForceCapture.run(16);
		Thread.sleep(2000);
		
		VTLevel2.run(4);
		Thread.sleep(2000);
		
		VTForceCapture.run(10);
		Thread.sleep(2000);
		
		try{
		driver=Browser.driver;
		txtTxnID = driver.findElement(By.id("transaction_id")).getText();
		ExcelUtil.storeCellData("Payments_VTForceCapture", "text::"+txtTxnID, 12, 33);
		ExcelUtil.storeCellData("Payments_Reports", txtTxnID, 5, 6);
		Thread.sleep(2000);
		}
		catch(Exception e){
			logResult.logTest("Test Execution", "Status", "INFO", "Exception occurred!!!", e.getMessage(), "");
		}
		
		VTForceCapture.run(12);
		Thread.sleep(2000);
		
		/*VTForcedCaptureDownloadPrint.run(4);
		Thread.sleep(2000);
		
		VTForcedCaptureDownloadPrint.run(6);
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
		
		Reports_CardReports.run(20);
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

