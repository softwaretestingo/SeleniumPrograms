package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_ClassNotFoundException 
{
	/**
	 * Sometime When we Run the program that time we are getting Class Not Found Exception
	 * Reason: The Guava Library is not Added Or Missed in Selenium Reference Library
	 * Solution: Add Maven Guava Library
	 * You can download from here also: https://mvnrepository.com/artifact/com.google.guava/guava
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		driver.quit();
	}
}