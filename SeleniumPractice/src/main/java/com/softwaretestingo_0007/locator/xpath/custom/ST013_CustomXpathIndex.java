package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST013_CustomXpathIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[starts-with(text(),'Submit') and @type='submit']")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}