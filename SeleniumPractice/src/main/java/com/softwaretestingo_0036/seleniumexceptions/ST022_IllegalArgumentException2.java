package com.softwaretestingo_0036.seleniumexceptions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST022_IllegalArgumentException2 
{
	/**
	 * Reason: You try to pass null Value in Sendkeys method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.softwaretestingo.com/text-box/");
		
		driver.findElement(By.name("fullName")).sendKeys(args);
		driver.quit();		
	}
}