package com.softwaretestingo.selectdropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleDropdownUsingSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(2000);
		driver.findElement(By.id("tools")).sendKeys(Keys.ENTER,Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}