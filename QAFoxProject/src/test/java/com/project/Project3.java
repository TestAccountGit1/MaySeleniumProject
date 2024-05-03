package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project3 {
	static WebDriver driver;
	
	@Parameters("browser")
	@Test(groups="functional")
	public void firefox(String browser)
	{
		if(browser.contains("ff")) {
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println("firefox method");
		}
		
	}

}
