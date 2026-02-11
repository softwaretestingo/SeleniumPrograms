package com.softwaretestingo_0022.chromeoptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ST004_OpenBrowserInMaximizedMode 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}