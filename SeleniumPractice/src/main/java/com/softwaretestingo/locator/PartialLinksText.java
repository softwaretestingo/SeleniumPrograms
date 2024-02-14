package com.softwaretestingo.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinksText 
{
	static WebElement links;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/locator-practice/");
		Thread.sleep(2000);
		links=driver.findElement(By.partialLinkText("Selenium"));
		links.click();
		Thread.sleep(2000);
	}
}