package com.test.automation.selenium.framework;

import java.lang.reflect.Method;

import com.test.automation.selenium.businesscomponents.bcEnvironment;

public class ExecutionInitiator{

	public static void run() throws Exception {

		@SuppressWarnings("rawtypes")
		Class[] paramString = new Class[3];	
		paramString[0] = String.class;
		paramString[1] = String.class;
		paramString[2] = String.class;
		String FileName;
		FileName = System.getProperty("user.dir") + "//Driver.xlsx";
		//FileName=ExecutionInitiator.class.getClassLoader().getResource("Driver.xlsx").getPath().substring(1);
		Environment.Initialise(FileName);
		bcEnvironment.Initialise(FileName);
		logResult.initializeReport();
			
		int noOfmodules =  ExcelUtil.getRowNumber(FileName, "Test Suites");
		for (int kk = 1; kk <= noOfmodules; kk++) {
			String strTestSuiteName = ExcelUtil.getCellData(FileName, "Test Suites", kk, 1);
			String strTestSuiteExecutionPerm = ExcelUtil.getCellData(FileName, "Test Suites", kk, 2);
			if (!strTestSuiteName.trim().isEmpty() && strTestSuiteExecutionPerm.trim().equalsIgnoreCase("Y")) {
				
				int noOfTestScriptCount =  ExcelUtil.getRowNumber(FileName, strTestSuiteName);
				for (int ii = 1; ii <= 5; ii++) {
					String BrowserType = "";
					switch (ii) {
						case 	1 : BrowserType = "IE";	break;
						case 	2 : BrowserType = "FIREFOX"; break;
						case 	3 : BrowserType = "CHROME"; break;
						case    4 : BrowserType = "HTMLUNIT"; break;
						case    5 : BrowserType = "CHROMEHEADLESS"; break;
					}
					for (int jj = 1; jj <= noOfTestScriptCount; jj++) {
						String strTestCaseName = ExcelUtil.getCellData(FileName, strTestSuiteName, jj, 0);
						if (!strTestCaseName.trim().isEmpty()) {
							String strTestClassName = ExcelUtil.getCellData(FileName,strTestSuiteName, jj, 1);
							String strTestExecutionApplicability = ExcelUtil.getCellData(FileName, strTestSuiteName, jj, ii+1);
							if (strTestExecutionApplicability.trim().equalsIgnoreCase("Y")) {
								logResult.startTest(strTestCaseName);
								try {
									Class<?> cls = Class.forName(strTestClassName.trim());
									Object obj = cls.newInstance();
									Method method = cls.getDeclaredMethod("ExecuteTest", paramString);
									method.invoke(obj, BrowserType, "", "");
								} catch (java.lang.ClassNotFoundException ex){
									ex.printStackTrace();
									logResult.logTest("Test Scripts", strTestClassName.trim()+".java", "INFO", "", "Test Script was not present", "");
								} finally {
									logResult.endTest();
								}
							}
						}
					}
				}	
			}
		}
		logResult.closeReport();
	}
}