package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSWithAttributeCLASS 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/locator-practice/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.close();
	}
}