package com.test.automation.selenium.businesscomponents;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.framework.Browser;

public class MerchantBoarding_MerchantUpdate {
	
	public static int intRowNum;
	public static WebDriver driver;
	
	public static void run(int rownum){
		
		intRowNum = rownum;
		driver=Browser.driver;
				
		try {
			
			
			Browser.InputData("MerchantBoarding_MerchantUpdt", intRowNum);
			Thread.sleep(4000);
			
			
			/*Alert alertSubmit = driver.switchTo().alert();
			alertSubmit.accept();*/
			
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}

