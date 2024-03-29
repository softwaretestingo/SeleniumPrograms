package com.softwaretestingo.locator.xpath.functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCountFunction 
{
	/* Returns the number of elements in a node set. */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(2000);
		
		

	}

}
