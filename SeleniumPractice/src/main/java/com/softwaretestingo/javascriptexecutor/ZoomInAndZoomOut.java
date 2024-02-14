package com.softwaretestingo.javascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ZoomInAndZoomOut 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='200.0%'");
		Thread.sleep(2000);
		js.executeScript("document.body.style.zoom='100.0%'");
		Thread.sleep(2000);

		driver.close();
	}
}