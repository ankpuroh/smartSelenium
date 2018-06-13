package com.test.automation.selenium.testScripts.recurring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.logResult;

public class TC_CustomerAdd_Token {
	
public static WebDriver driver=Browser.driver;
	
	/*String delContractSQL = null;
	String delCustomerSQL = null;*/
	String txtCustNo = null;
		
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
		try{
			
			Recurring_CustomerAdd.run(4);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(10);
			Thread.sleep(2000);
			
			try{
			driver=Browser.driver;
			txtCustNo = driver.findElement(By.id("customerNumber")).getAttribute("value");
			ExcelUtil.storeCellData("Recurring_CustomerAdd", "text::"+txtCustNo, 24, 68);
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
			
			Recurring_CustomerAdd.run(24);
			Thread.sleep(2000);
			
			Recurring_CustomerAdd.run(26);
			Thread.sleep(2000);
			
			/*delContractSQL = "delete from edgepay_gateway_db.edgepay_recurring_customer_contract where edgepay_rec_cust_contract_description like 'Suman%'";
			DBUtil.updateQuery(delContractSQL);
			
			delCustomerSQL = "delete from edgepay_gateway_db.edgepay_recurring_customer where edgepay_recurring_customer_number = '2911' and edgepay_recurring_customer_merchant_id = '271105091008'";
			DBUtil.updateQuery(delCustomerSQL);*/
			
			}catch(Exception ex){
			
		}
		
	}

}
