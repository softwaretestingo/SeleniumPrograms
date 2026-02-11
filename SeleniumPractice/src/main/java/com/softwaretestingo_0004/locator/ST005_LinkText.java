package com.softwaretestingo_0004.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST005_LinkText 
{
	static WebElement links;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		links=driver.findElement(By.linkText("Forgot your password?"));
		links.click();
		Thread.sleep(2000);
		driver.quit();
	}
}