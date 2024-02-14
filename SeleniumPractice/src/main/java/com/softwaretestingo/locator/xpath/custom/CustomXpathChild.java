package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathChild 
{
	// /..-->> Represent Immediate Parent
	// /child::<tagname> -->> Switch to Child
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(2000);
		String userNametext=driver.findElement(By.xpath("//label[@for='uname']/child::*")).getText();
		System.out.println("The Text is: "+userNametext);
		
		String userNametext1=driver.findElement(By.xpath("//label[@for='uname']/child::b")).getText();
		System.out.println("The Text is: "+userNametext1);
		driver.close();
	}
}