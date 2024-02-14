package com.softwaretestingo.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathContains 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'userName')]")).sendKeys("SoftwareTestingo Blog");
		Thread.sleep(3000);
		driver.close();
	}
}