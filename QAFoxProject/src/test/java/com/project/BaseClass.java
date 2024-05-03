package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	static WebDriver driver;
	@BeforeMethod(groups={"smoke","regression","functional"})
	public void launchbrowser() {
		
		driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
	}
	
	
	@BeforeSuite
	public void start1() {
		ExtentManager.setExtent();
		System.out.println("test starting");
	}
	
	@AfterSuite
	public void end1() {
		ExtentManager.endReport();
		System.out.println("test ending");
	}
	}
		
