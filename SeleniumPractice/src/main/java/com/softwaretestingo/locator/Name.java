package com.softwaretestingo.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Name 
{
	static WebElement names;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/disabled-field-button/");
		Thread.sleep(4000);
		names=driver.findElement(By.name("fname"));
		names.sendKeys("Softwaretestingo");
		Thread.sleep(2000);
		driver.close();
	}
}