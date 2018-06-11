package com.test.automation.selenium.businesscomponents;

import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.framework.Browser;

public class Settings_Cache {
	
	public static int intRowNum;
	public static WebDriver driver;
	
	public static void run(int rownum){
		
		intRowNum = rownum;
		driver=Browser.driver;
				
		try {
			
			Browser.InputData("Settings_Cache", intRowNum);
			Thread.sleep(4000);
			
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}