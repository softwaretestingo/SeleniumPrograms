package com.softwaretestingo.seleniumexceptions;
import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InvalidArgumentException1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// If You have not add https in URL you will get InvalidArgumentException
		driver.get("www.demo.softwaretestingo.com/upload-download/");
		Thread.sleep(3000);
		Thread.sleep(3000);
	}
}