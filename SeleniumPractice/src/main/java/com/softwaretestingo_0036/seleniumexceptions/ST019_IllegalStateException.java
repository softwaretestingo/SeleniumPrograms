package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST019_IllegalStateException 
{
	/**
	 * IllegalStateException: This Is For Firefox
	 * If you are trying to run in Firefox browser but the browser driver is not available because of access issue 
	 * or any other issue
	 * Solution: download the driver and place and later Add System.setproperty
	 * Drivers will be located at: 
	 * C:\\users\[UserName]\.cache\selenium 
	 */
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		driver.quit();
	}
}