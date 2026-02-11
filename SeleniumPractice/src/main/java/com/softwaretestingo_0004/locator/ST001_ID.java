package com.softwaretestingo_0004.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_ID 
{
	static WebElement name;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		name=driver.findElement(By.id("inputUsername"));
		name.sendKeys("SoftwareTestingo");
		Thread.sleep(2000);
		driver.quit();	
	}
}