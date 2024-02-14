package com.softwaretestingo.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ID 
{
	static WebElement name;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(2000);
		name=driver.findElement(By.id("userName"));
		name.sendKeys("SoftwareTestingo");
		Thread.sleep(2000);
		driver.close();	
	}
}