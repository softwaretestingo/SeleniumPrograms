package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST015_XPathName 
{
	/*
	 * 
	 * 
	 */	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class=\"RjvT8t\"]/input")).sendKeys("mobile");
		driver.findElement(By.xpath("(//*[name()=\"svg\"])[position()=1]")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}