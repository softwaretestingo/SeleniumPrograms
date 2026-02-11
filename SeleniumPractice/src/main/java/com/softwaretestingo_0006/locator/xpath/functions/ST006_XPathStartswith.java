package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST006_XPathStartswith 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/xpath-locators.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Automation')]")).click();
		Thread.sleep(10000);
		driver.quit();
	}
}