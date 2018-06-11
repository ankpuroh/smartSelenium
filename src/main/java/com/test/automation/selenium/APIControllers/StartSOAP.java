package com.test.automation.selenium.APIControllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.automation.selenium.AutomationDTO.AutomationParam;
import com.test.automation.selenium.framework.ExcelUtil;
import com.test.automation.selenium.framework.ExecutionInitiator;
import com.test.automation.selenium.services.AutomationService;

@Controller
@RequestMapping("/automation/api")
public class StartSOAP {


	@Autowired
	private AutomationService automationService;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public ResponseEntity<?> triggerAPIAutomation() {
		{

			Runnable run1 = new Runnable()

			{

				public void run()

				{

					Process p;
					String command = "start cmd /k testrunner.bat -a -f\"D:\\SOAPAUTORUN\\GET-PSP\" -FPDF -R\"Project Report\" \"D:\\GET\\Automation\\API Automation\\GET-PSP.xml\"";
					System.out.println(command);
					try {
						p = Runtime.getRuntime().exec(command);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

			};

			Thread th1 = new Thread(run1);

			th1.start();
			// runDriver();
			return new ResponseEntity<String>("Response....", HttpStatus.OK);

		}

	}

	@Async
	public void runDriver() {
		ExecutionInitiator driver = new ExecutionInitiator();
		try {
			driver.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Executing Automation");
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	@RequestMapping(value = "/start", method = RequestMethod.POST)
	public ResponseEntity<?> triggerCustomAutomation(@RequestBody AutomationParam params) {

		Runnable run1 = new Runnable() {

			public void run() {
				ExecutionInitiator driver = new ExecutionInitiator();
				String environment = "";
				String url = "";
				String browserType = "";
				String testDataFolder = "";
				String testResultFolder = "";
				String browserDriverFolder = "";
				String projectName = "";
				browserDriverFolder = params.getBrowserDriverFolder();
				browserType = params.getBrowserType();
				environment = params.getEnvironment();
				projectName = params.getProjectName();
				testDataFolder = params.getTestDataFolder();
				testResultFolder = params.getTestResultFolder();
				url = params.getUrl();

				try {
					if (browserDriverFolder != "") {
						ExcelUtil.setCellData("Driver.xlsx", "Automation Framework Config", browserDriverFolder, 2, 1);
					}

					// ExcelUtil.setCellData("Driver.xlsx", "Automation Framework Config",
					// browserType,2 ,1 );
					// ExcelUtil.setCellData("Driver.xlsx", "Automation Framework Config",
					// environment,2 ,1 );
					if (projectName != "" && projectName != null) {
						ExcelUtil.setCellData("Driver.xlsx", "Application Initialization", projectName, 1, 1);
					}
					if (testDataFolder != "" & testDataFolder != null) {
						ExcelUtil.setCellData("Driver.xlsx", "Automation Framework Config", testDataFolder, 10, 1);
					}

					if (testResultFolder != "" && testResultFolder != null) {
						ExcelUtil.setCellData("Driver.xlsx", "Automation Framework Config", testResultFolder, 11, 1);
					}
					if (url != "" && url != null) {
						ExcelUtil.setCellData("Driver.xlsx", "Application Initialization", url, 3, 1);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				try {
					driver.run();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Error Executing Automation");
					e.printStackTrace();
				}

			}
		};

		Thread t1 = new Thread(run1);
		t1.start();
		return new ResponseEntity<String>("Started....", HttpStatus.OK);
	}


}
