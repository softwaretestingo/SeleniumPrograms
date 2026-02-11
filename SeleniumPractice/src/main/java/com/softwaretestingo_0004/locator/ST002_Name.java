package com.softwaretestingo_0004.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_Name 
{
	static WebElement names;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(4000);
		names=driver.findElement(By.name("inputPassword"));
		names.sendKeys("Softwaretestingo");
		Thread.sleep(2000);
		driver.quit();
	}
}