package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSWithMultipleAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='user'][name='uname']")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.close();
	}
}