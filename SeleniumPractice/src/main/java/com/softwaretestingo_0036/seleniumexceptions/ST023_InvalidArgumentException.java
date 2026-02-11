package com.softwaretestingo_0036.seleniumexceptions;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST023_InvalidArgumentException 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.softwaretestingo.com/upload-download/");
		Thread.sleep(3000);
		// When you use Click Operation On File Upload Button you will get InvalidArgumentException
		//driver.findElement(By.id("uploadFile")).click();
		driver.findElement(By.cssSelector("input#uploadFile")).click();
		Thread.sleep(3000);
	}
}