package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST011_DeleteAllCookies 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		System.out.println("Cookies Deleted");
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}