package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoSuchElementException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(2000);
		//NoSuchElementException: Syntax Is Correct But No element WIth that Id Thats why you are getting
		driver.findElement(By.id("@@@userName")).sendKeys("Text");
		Thread.sleep(2000);
		driver.close();
	}
}