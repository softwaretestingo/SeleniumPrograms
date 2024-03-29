package com.softwaretestingo.chromeoptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class OpenBrowserWithDisablePopupBlocking 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-extensions");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}