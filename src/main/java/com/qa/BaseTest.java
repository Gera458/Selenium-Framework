package com.qa;
import java.util.concurrent.TimeUnit;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;
import com.relevantcodes.extentreports.LogStatus;

import utils.Constants;

public class BaseTest implements Constants {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	//public static ExtentTest test;
	public HTMLReporter htmlReporter;
	static ExtentTest test;
	
	
	@BeforeTest
	public void beforeTest()
	{
		
		
	}
	
	@BeforeMethod
	@Parameters(value={"browserName"})
	public void beforeTestMethod(String browserName) throws InterruptedException
	{
		
		
	   
		setupDriver(browserName);
		driver.manage().window().maximize();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		Thread.sleep(4000);
		
		
	}
	
	@AfterTest
	public void aftertest(ITestResult result)
	{
		
		
		driver.quit();
		
		
	}
	
	@AfterMethod
	public void AftertestMethod()
	{
		
		driver.quit();
		
	}
	
	
	
	public void setupDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agnext\\eclipse-workspace\\Nafed_Automation\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			
		}
		else {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agnext\\eclipse-workspace\\Nafed_Automation\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
	}
	

}
