package com.softwaretestingo.webdrivercommands;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PageLoadTimeout 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		System.out.println("Cookies Deleted");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://demo.softwaretestingo.com");
		Thread.sleep(5000);
		driver.close();
	}
}