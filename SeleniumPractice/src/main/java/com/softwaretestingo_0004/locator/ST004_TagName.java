package com.softwaretestingo_0004.locator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_TagName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Number Of Links In The Page: "+links.size());
		driver.quit();
	}
}