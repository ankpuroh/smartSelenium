package com.test.automation.selenium.config;

import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.test.automation.selenium")
public class GetuiAutomationApplication {

	public static void main(String[] args) throws URISyntaxException {
		SpringApplication.run(GetuiAutomationApplication.class, args);
	}
}
