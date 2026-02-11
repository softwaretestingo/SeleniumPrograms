package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_ElementNotInteractableException 
{
	/**
	 * ElementNotInteractableException: If You Try to Send Some Value then 
	 * You Will Get  ElementNotInteractableException
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/disabled-field-button/");
		Thread.sleep(3000);
		
		// For Disabled Field If You Try to Send Some Value then You Will Get  ElementNotInteractableException
		driver.findElement(By.id("lname")).sendKeys("Testing");
		Thread.sleep(3000);
		driver.quit();
		
		//To Solve This Type Of Exception You Can Use Actions Class Click
	}
}