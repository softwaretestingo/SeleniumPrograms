package com.softwaretestingo_0003.sendkeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendKeysEx 
{
	/**
	 * This Is an Example Of sendKeys()
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("SoftwareTestingo");
		driver.findElement(By.id("password")).sendKeys("Testing");
		
		Thread.sleep(3000);
		driver.quit();
	}
}