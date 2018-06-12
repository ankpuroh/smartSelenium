package com.test.automation.selenium.testScripts.tokenManager;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;
import com.test.automation.selenium.framework.ExcelUtil;

public class TC_DeTokenize_Token {
	
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
			
			TokenManager_UpdateDeTokenize.run(28);
			Thread.sleep(2000);
			
			ReadCardToken readexcel = new ReadCardToken();
			Map<String,String> hm = readexcel.getCardToken(filename, sheetname); 
						
			for(Map.Entry m:hm.entrySet()){
				
				strCard = (String) m.getKey();
				ExcelUtil.storeCellData("TokenManager_UpdateDeTokenize", "valueattribute::"+strCard, 34, 17);
				strToken = (String) m.getValue();
				ExcelUtil.storeCellData("TokenManager_UpdateDeTokenize", strToken, 29, 15);
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(30);
				Thread.sleep(2000);
				
				TokenManager_UpdateDeTokenize.run(32);
				Thread.sleep(2000);	
				
				TokenManager_UpdateDeTokenize.run(34);
				Thread.sleep(2000);	
				
				TokenManager_UpdateDeTokenize.run(36);
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
