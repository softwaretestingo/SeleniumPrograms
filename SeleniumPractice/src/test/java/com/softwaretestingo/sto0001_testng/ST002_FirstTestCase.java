package com.softwaretestingo.sto0001_testng;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ST002_FirstTestCase 
{
	WebDriver driver;
	String title;
	
	@Test
	public void launchURL() 
	{
		driver.get("https://www.softwaretestingo.com/");
		title=driver.getTitle();
		System.out.println("Page Title: "+title);
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();
	}
	@Test(description = "Login Test")
	public void login()
	{
		System.out.println("Login Method Executed");
	}
}