package com.softwaretestingo.waits;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//in Selenium 3 But Its Depreceiated In Selenium 4
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// From Selenium 4 Onwards 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.softwaretestingo.com/text-box/");
		
		driver.findElement(By.name("fullName")).sendKeys("SoftwareTestingO");
		driver.close();		
	}
}