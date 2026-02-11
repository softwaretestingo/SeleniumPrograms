package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_ElementClickInterceptedException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2022/09/disabled-field-button.html");
		Thread.sleep(3000);
		
		// For Disabled Field If You Try to Click then You Will Get  ElementNotInteractableException
		driver.findElement(By.xpath("//button[text()=' Submit Button ']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		//To Solve This Type Of Exception You Can Use Actions Class Click
	}
}