package com.softwaretestingo.locator.relative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocatorsBelow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		
		WebElement userName=driver.findElement(By.id("user"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(userName)).sendKeys("SoftwareTestingo");	
		Thread.sleep(3000);
		driver.close();
	}
}