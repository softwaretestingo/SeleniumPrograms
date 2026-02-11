package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST011_CustomXpathSelf 
{
	// /..-->> Represent Immediate Parent
	// /parent::<tagname> -->> Switch to Immediate or Respected Parent
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		String lblLastname=driver.findElement(By.xpath("//*[@for='lname']/self::*")).getText();
		System.out.println("The Lastname Label Text is: "+lblLastname);
		driver.quit();
	}
}