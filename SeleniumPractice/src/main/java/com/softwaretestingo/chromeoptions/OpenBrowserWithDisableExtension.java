package com.softwaretestingo.chromeoptions;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class OpenBrowserWithDisableExtension 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));;
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		
		Thread.sleep(5000);
		driver.quit();
	}
}