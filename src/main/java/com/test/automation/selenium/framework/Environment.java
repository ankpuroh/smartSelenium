package com.test.automation.selenium.framework;


public class Environment {
	public static String CurrentScreenName = "";
	public static String PrevioustScreenName = "";
	public static String browserDriverDir = "";
	public static String browserDriverName = "";
	public static String tempDir = "";
	public static String dataDir = "";
	public static String resultDir = "";
	public static int implicitTimeOut = 20;
	public static int explicitTimeOut = 20;
	public static Boolean CaptureScreenshotSuccessPage = false;
	public static int TestDataRowIndex;
	public static String browserName;
	
	public static String iebrowserDriverName = "";
	public static String chromebrowserDriverName = "";
	
	public static void Initialise(String FileName) throws Exception  {
		
		String osName;
		browserDriverDir 		= ExcelUtil.getCellData(FileName, "Automation Framework Config", 2, 1);
		iebrowserDriverName 	= ExcelUtil.getCellData(FileName, "Automation Framework Config", 3, 1);
		chromebrowserDriverName = ExcelUtil.getCellData(FileName, "Automation Framework Config", 4, 1);
		browserDriverName 		= iebrowserDriverName;
		
		dataDir 				= ExcelUtil.getCellData(FileName, "Automation Framework Config", 10, 1);
		resultDir 				= ExcelUtil.getCellData(FileName, "Automation Framework Config", 11, 1);
		System.out.println(System.getProperty("os.name"));
		osName = new String(System.getProperty("os.name"));
		if (osName.equalsIgnoreCase("Linux"))
		{
			browserDriverName = browserDriverName.replaceAll(".exe", "");
			chromebrowserDriverName = chromebrowserDriverName.replaceAll(".exe", "");
			System.out.println(browserDriverName);
			System.out.println(chromebrowserDriverName);
		}
		
		//String strTimeOut 		= ExcelUtil.getCellData(FileName, "Automation Framework Config", 12, 1);
		//implicitTimeOut 		= Integer.parseInt(strTimeOut);
		//strTimeOut 				= ExcelUtil.getCellData(FileName, "Automation Framework Config", 13, 1);
		//explicitTimeOut 		= Integer.parseInt(strTimeOut);
	}
}