package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("user")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.close();
	}
}