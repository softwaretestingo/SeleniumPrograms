package com.softwaretestingo.pseudo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElement 
{
	
	//Print The Star Before The Name
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/register");
		Thread.sleep(2000);
		
		String script="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String mandatry_field =  js.executeScript(script).toString();
		System.out.println("The Mandatory Field Values is: "+mandatry_field);
		
		driver.quit();
	}
}