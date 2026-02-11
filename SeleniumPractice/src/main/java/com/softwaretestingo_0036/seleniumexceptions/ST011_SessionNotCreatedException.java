package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST011_SessionNotCreatedException 
{
	public static void main(String[] args) 
	{
		/*
		 * SessionNotCreatedException: If you run automation in an old version of chromedriver then you will get
		 * this. to soluve you need to update the chrome driver
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com");
	}
}