package com.softwaretestingo_0012.javascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_GetPageTitle
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);

		JavascriptExecutor js=(JavascriptExecutor) driver;
		String pageTitle= js.executeScript("return document.title;").toString();
		System.out.println("Home Page Title: "+pageTitle);
		driver.quit();
	}
}