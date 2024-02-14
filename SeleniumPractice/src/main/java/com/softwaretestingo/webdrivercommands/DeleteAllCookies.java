package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DeleteAllCookies 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		System.out.println("Cookies Deleted");
		driver.get("https://demo.softwaretestingo.com");
		Thread.sleep(2000);
		driver.close();
	}
}