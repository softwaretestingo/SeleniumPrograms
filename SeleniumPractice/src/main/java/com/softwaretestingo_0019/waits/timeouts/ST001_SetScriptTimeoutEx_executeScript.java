package com.softwaretestingo_0019.waits.timeouts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_SetScriptTimeoutEx_executeScript 
{
	/*
	 * This is used to set the time the WebDriver must wait for an asynchronous
	 * script to finish execution before throwing an error. If the timeout is
	 * negative, then the script will be allowed to run indefinitely.
	 */
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/alerts/");
		/*
		 * The default timeout for setScriptTimeout method is zero. If you do not set
		 * time, then there are chances that executeAsyncScript method may fail because
		 * the JavaScript code may take more than the time allotted. To avoid such
		 * failures, set the setScriptTimeout. This is mainly used for Javascript
		 * objects and executors.
		 */
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
	}
}