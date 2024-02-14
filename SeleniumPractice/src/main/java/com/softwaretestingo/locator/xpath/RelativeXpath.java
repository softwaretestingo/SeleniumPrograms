package com.softwaretestingo.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RelativeXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-26\"]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}
}