package com.test.automation.selenium.businesscomponents;

import com.test.automation.selenium.framework.ExcelUtil;

public class bcEnvironment {
	public static String projectName ="";
	public static String projectVer ="";
	public static String appURL ="";
	public static String loginUserName ="";
	public static String loginPassword ="";
	
	public static void Initialise(String FileName) throws Exception  {
		projectName 	= ExcelUtil.getCellData(FileName, "Application Initialization", 1, 1);
		projectVer		= ExcelUtil.getCellData(FileName, "Application Initialization", 2, 1);
		appURL 			= ExcelUtil.getCellData(FileName, "Application Initialization", 3, 1);
		loginUserName 	= ExcelUtil.getCellData(FileName, "Application Initialization", 4, 1);
		loginPassword 	= ExcelUtil.getCellData(FileName, "Application Initialization", 5, 1);
	}
}
