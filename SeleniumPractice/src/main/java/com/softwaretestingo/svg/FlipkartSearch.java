package com.softwaretestingo.svg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile");
		driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='path'])[2]")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
}