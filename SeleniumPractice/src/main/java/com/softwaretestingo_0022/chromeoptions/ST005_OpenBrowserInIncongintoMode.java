package com.softwaretestingo_0022.chromeoptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ST005_OpenBrowserInIncongintoMode 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}