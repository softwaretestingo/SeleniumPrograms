package com.softwaretestingo_0001.launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST003_LaunchFirefoxBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}