package com.softwaretestingo_0012.javascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST009_ShadowDOMEnterText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/08/shadowdom.html");
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Copy The JS Path Of The Element and add Return to return the element
		//As in Selenium We are dealing with the WebElement
		WebElement txtBoxElement=(WebElement)js.executeScript("return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"input[type=text]:nth-child(4)\")");
		txtBoxElement.sendKeys("Hi");
		Thread.sleep(5000);
		driver.quit();
	}
}