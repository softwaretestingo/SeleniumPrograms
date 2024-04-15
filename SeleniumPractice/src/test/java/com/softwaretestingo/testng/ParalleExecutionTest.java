package com.softwaretestingo.testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class ParalleExecutionTest 
{
	@Test
	public void openChrome() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void openFirefox() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void openEdge() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}