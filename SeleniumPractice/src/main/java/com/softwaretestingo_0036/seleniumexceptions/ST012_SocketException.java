package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST012_SocketException 
{
	public static void main(String[] args) 
	{
		/*
		 * SocketException: Happens Because of .close() method, may be due to some reason the socket not closed
		 * properly. 
		 * Solution: use driver.quit();
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com");
	}
}