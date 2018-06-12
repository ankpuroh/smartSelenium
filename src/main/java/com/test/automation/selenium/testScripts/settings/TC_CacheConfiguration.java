package com.test.automation.selenium.testScripts.settings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.test.automation.selenium.businesscomponents.*;
import com.test.automation.selenium.framework.Browser;

public class TC_CacheConfiguration {
	
public static WebDriver driver=Browser.driver;
	
	public void ExecuteTest(String BrowserType, String strProgramDetails, String strTestEnvDetails) throws Exception 
	{
			
		try{
			
			Settings_Cache.run(4);
			Thread.sleep(2000);
			
			Settings_Cache.run(6);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(8);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(10);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(12);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(14);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(16);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(18);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(20);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(22);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(24);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(26);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(28);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(30);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(32);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			Settings_Cache.run(34);
			Thread.sleep(2000);
			
			Settings_Cache.run(40);
			Thread.sleep(2000);
			
			driver=Browser.driver;
			
			List<WebElement> Replenish = driver.findElements(By.xpath("//button[text()='Replenish Cache']"));
			
			for(int i=0;i<Replenish.size();i++){
				
				Replenish.get(i).click();
				Thread.sleep(2000);
				
				Settings_Cache.run(40);
				Thread.sleep(2000);
			}
			
				
			}catch(Exception ex){
			
		}
		
	}

}
