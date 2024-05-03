package com.project;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Project2 extends BaseClass {
	@Test(groups="smoke" ,description="automation3",priority=1)	
	public void brokenLink() throws Exception
	{
		Thread.sleep(300);
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Broken Images')]"));
		element2.click();
		URL url = new URL("https://the-internet.herokuapp.com/broken_images");
		HttpURLConnection connection =(HttpURLConnection) url.openConnection();
		connection.setRequestMethod("HEAD");
		 int responseCode = connection.getResponseCode();
		 List<WebElement> images = driver.findElements(By.tagName("img"));
		 for (WebElement img : images) {
	            String src = img.getAttribute("src");
	            try {
	            	
	                if (responseCode != HttpURLConnection.HTTP_OK) {
	                    System.out.println("Broken image found: " + src);
	                    // Handle the broken image, e.g., log the URL, take a screenshot, etc.
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
		
}
		 
	
	} 
	
	@Test(groups="regression",description="automation2",priority=2)
	public void sysout()
	{
		System.out.println("testmethod");
	}
	
	@Test(groups="functional" ,description="automation4",priority=3)
		
		public void sysout2()
		{
			System.out.println("testmethod2");
		}
		
	}

