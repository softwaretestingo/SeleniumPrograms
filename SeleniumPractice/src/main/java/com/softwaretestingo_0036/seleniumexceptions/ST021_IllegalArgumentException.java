package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST021_IllegalArgumentException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(3000);
		
		WebElement userName=driver.findElement(By.id("userName"));
		//When You Pass Null Through SendKeys To an Element
		userName.sendKeys(null);
		driver.quit();
	}
}