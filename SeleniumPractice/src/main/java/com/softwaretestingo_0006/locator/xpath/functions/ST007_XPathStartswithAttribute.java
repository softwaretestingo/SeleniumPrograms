package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST007_XPathStartswithAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/class-name-locator.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@alt,\"Enter Your Name\")]")).sendKeys("Softwaretestingo");
		Thread.sleep(5000);
		driver.quit();
	}
}