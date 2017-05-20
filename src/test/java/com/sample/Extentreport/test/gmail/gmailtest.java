package com.sample.Extentreport.test.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class gmailtest {

	WebDriver driver;
	ExtentReports rep;
	ExtentTest test;
	
	@Test
	public gmailtest() {
		rep=new ExtentReports("C://ExtentReport//report.html");
		test=rep.startTest("gmailtest");
		System.setProperty("webdriver.firefox.marionette", "E://Selenium//geckodriver.exe");
		driver=new FirefoxDriver();
		test.log(LogStatus.INFO, "Broswer started");
	}

}
