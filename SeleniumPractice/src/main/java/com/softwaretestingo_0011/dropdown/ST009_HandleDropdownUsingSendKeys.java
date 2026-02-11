package com.softwaretestingo_0011.dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST009_HandleDropdownUsingSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select")).sendKeys(Keys.ENTER,Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}