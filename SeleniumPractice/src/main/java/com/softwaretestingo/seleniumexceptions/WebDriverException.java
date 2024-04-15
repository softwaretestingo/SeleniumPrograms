package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverException 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// If You have not add domain extension then you will get WebDriverException  
		driver.get("https://www.demo.softwaretestingo");
	}
}