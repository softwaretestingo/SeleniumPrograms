package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavascriptException 
{
	//Need to Fix JavascriptException Of This Program
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Copy The JS Path Of The Element and add Return to return the element
		// As in Selenium We are dealing with the WebElement
		WebElement txtBoxElement = (WebElement) js.executeScript(
				"return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		txtBoxElement.sendKeys("Hi");
		
		// Need to Implement this and see https://youtu.be/-uMLqBO2x7c

	}

}
