package com.test.automation.selenium.businesscomponents;
import com.test.automation.selenium.framework.Browser;

public class Login {
	public static int intRowNum;
	
	public static void run(String browserType,int rownum){
		intRowNum= rownum;
		try {
			Thread.sleep(4000);
			Browser.Open(browserType, bcEnvironment.appURL);
			Browser.InputData("Login_Login", intRowNum);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	public static void goBackToLoginAgain(int rownum){
		intRowNum= rownum;
		try {
				Thread.sleep(4000);
				Browser.InputData("Login_Login", intRowNum);
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}

}
