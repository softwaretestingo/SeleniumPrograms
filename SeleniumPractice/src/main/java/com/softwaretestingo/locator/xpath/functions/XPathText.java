package com.softwaretestingo.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/locator-practice/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Selenium Tutorial']")).click();
		Thread.sleep(10000);
		driver.close();
	}
}