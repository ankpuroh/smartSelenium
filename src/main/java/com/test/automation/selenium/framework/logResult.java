package com.test.automation.selenium.framework;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class logResult {

	public static int testPassCount = 0;
	public static int testFailCount = 0;
	static OutputStream htmlfile = null;
	static PrintStream printhtml = null;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void initializeReport() {
		String Path = ".//" + Environment.resultDir + "//AutomationReport.html";
		System.out.println(Path);
		extent = new ExtentReports(Path, true);
	}

	public static void startTest(String testName) {
		test = extent.startTest(testName);
	}

	public static void logTest(String name1, String name2, String name3, String name4, String name5, String name6) {
		System.out.println(
				"output ->" + name1 + "<->" + name2 + "<->" + name3 + "<->" + name4 + "<->" + name5 + "<->" + name6);
		String dtls;
		if (name4.isEmpty())
			dtls = name5;
		else
			dtls = name4 + "::" + name5;

		switch (name3.toUpperCase()) {
		case "PASS":
			test.log(LogStatus.PASS, name1 + "::" + name2, dtls);
			break;

		case "FAIL":
			test.log(LogStatus.FAIL, name1 + "::" + name2,
					dtls + ":: Screenshot: <span style='font-weight:bold;'>" + name6 + "</span>");

			break;

		case "INFO":
			test.log(LogStatus.INFO, name1 + "::" + name2, dtls);
			break;
		}
	}

	public static void endTest() {
		extent.endTest(test);
		extent.flush();
	}

	public static void closeReport() {
		extent.close();
	}

	public static String CaptureScreen(WebDriver driver, String ImagesPath) {
		TakesScreenshot oScn = (TakesScreenshot) driver;
		File oScnShot = oScn.getScreenshotAs(OutputType.FILE);
		File oDest = new File(ImagesPath + ".jpg");
		try {
			FileUtils.copyFile(oScnShot, oDest);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return ImagesPath + ".jpg";
	}
}
