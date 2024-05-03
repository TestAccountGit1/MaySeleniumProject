package com.project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
@Listeners(ExampleListener.class)
public class Project1 extends BaseClass{
	
	
	@Test(groups="regression" , description="automation1" , priority=0)
	public void basicAuth() throws Exception
	{
		
		Thread.sleep(300);
		WebElement element1 = driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]"));
		element1.click();
		String s = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(s);
		
			
		}
		       
	
	}


