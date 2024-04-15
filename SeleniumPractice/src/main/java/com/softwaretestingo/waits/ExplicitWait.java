package com.softwaretestingo.waits;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExplicitWait 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Explicit Wait two Types - WebDriverWait & Fluent Wait
		driver.close();
	}
}