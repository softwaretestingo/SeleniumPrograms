package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST006_SendKeys 
{
	// By Using sendKeys() method you can send text to the textbox 
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}