package com.softwaretestingo.sto0001_testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class ST004_ParalleExecutionTest 
{
	@Test
	public void openChrome() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void openFirefox() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void openEdge() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}