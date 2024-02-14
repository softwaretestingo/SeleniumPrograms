package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/locator-practice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[starts-with(text(),'Selenium')])[position()=1]")).click();
		Thread.sleep(10000);
		driver.close();
	}
}