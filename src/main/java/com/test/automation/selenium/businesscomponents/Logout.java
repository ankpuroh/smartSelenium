package com.test.automation.selenium.businesscomponents;
import org.openqa.selenium.WebDriver;

import com.test.automation.selenium.framework.Browser;

public class Logout {
	public static int intRowNum;
	public static WebDriver driver=Browser.driver;
	
	public static void run(int rownum){
		intRowNum= rownum;
		try {
			Thread.sleep(40);
			Browser.InputData("Logout_Logout", intRowNum);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
