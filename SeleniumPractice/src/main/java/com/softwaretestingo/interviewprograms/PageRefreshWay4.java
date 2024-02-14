package com.softwaretestingo.interviewprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PageRefreshWay4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.F5);
		Thread.sleep(3000);
		driver.quit();
	}
}