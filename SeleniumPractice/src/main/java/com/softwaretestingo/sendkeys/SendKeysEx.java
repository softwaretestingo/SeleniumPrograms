package com.softwaretestingo.sendkeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendKeysEx 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.id("user")).sendKeys("SoftwareTestingo");
		driver.findElement(By.id("pass1")).sendKeys("Testing");
		
		Thread.sleep(3000);
		driver.close();
	}
}