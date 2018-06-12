package com.test.automation.selenium.testScripts.tokenManager;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;

public class TC_Update_CardToken {
	
public static WebDriver driver=Browser.driver;
public String filename = "D:\\GETAutomation\\GETAutomation\\testdata\\TokenManager.xlsx";
public String sheetname = "Tokens";
public static String strToken = null;
public static String strCard = null;
	
			
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
				
		try{
			
			Login.run(BrowserType, 6);
			Thread.sleep(4000);
			
			TokenManager_UpdateDeTokenize.run(4);
			Thread.sleep(2000);
			
			TokenManager_UpdateDeTokenize.run(6);
			Thread.sleep(2000);
			
			TokenManager_UpdateDeTokenize.run(8);
			Thread.sleep(2000);
			
			ReadCardToken readexcel = new ReadCardToken();
			Map<String,String> hm = readexcel.getCardToken(filename, sheetname); 
						
			for(Map.Entry m:hm.entrySet()){
				
				strCard = (String) m.getKey();
				strToken = (String) m.getValue();
				ExcelUtil.storeCellData("TokenManager_UpdateDeTokenize", strToken, 9, 5);
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(10);
				Thread.sleep(2000);				
				
				TokenManager_UpdateDeTokenize.run(12);
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(14);
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(16); 
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(18); 
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(20); 
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(22); 
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(24); 
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(26); 
				Thread.sleep(2000);
				
			}
			
			Logout.run(4);
			Thread.sleep(2000);
			
			Logout.run(6);
			Thread.sleep(2000);
			
			Logout.run(8);
			Thread.sleep(2000);
			
			Browser.Close();
			Thread.sleep(2000);
			
			
		}catch(Exception ex){
			
		}
		
	}

}
