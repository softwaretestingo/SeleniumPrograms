package com.softwaretestingo_0038.interviewprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST005_PageRefreshWay 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("wp-block-search__input-1")).sendKeys("\uE035");
		Thread.sleep(3000);
		driver.quit();
	}
}