package com.softwaretestingo.waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class StaticWait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/radio/");
		Thread.sleep(3000);

		driver.findElement(By.id("sing")).click();
		Thread.sleep(3000);
		driver.close();
	}
}