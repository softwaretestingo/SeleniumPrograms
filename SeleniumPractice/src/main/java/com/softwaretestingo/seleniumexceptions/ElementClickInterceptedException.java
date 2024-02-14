package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementClickInterceptedException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/register/");
		Thread.sleep(3000);
		
		// For Disabled Field If You Try to Click then You Will Get  ElementNotInteractableException
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.close();
		
		//To Solve This Type Of Exception You Can Use Actions Class Click
	}
}