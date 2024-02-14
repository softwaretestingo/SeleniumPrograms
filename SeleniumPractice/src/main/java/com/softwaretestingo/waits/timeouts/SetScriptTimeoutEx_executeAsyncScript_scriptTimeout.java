package com.softwaretestingo.waits.timeouts;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetScriptTimeoutEx_executeAsyncScript_scriptTimeout 
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
		
		// Befopre - Below setScriptTimeout method Is Depreciated In Selenium
		//driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(20));
		//driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		// After - In Selenium 4
		//driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(20));
		
		driver.get("https://demo.softwaretestingo.com/alerts/");
		
		
		/*
		 * The default timeout for setScriptTimeout method is zero. If you do not set
		 * time, then there are chances that executeAsyncScript method may fail because
		 * the JavaScript code may take more than the time allotted. To avoid such
		 * failures, set the setScriptTimeout. This is mainly used for Javascript
		 * objects and executors.
		 */
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeAsyncScript("var callback = arguments[arguments.length - 1];" +
				   "var xhr = new XMLHttpRequest();" +
				   "xhr.open('GET', '/resource/data.json', true);" +
				   "xhr.onreadystatechange = function() {" +
				   "  if (xhr.readyState == 4) {" +
				   "    callback(xhr.responseText);" +
				   "  }" +
				   "}" +
				   "xhr.send();");
	}
}