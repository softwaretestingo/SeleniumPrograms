package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSWithAttributeIDCLASS 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#userName.mr-sm-2.form-control")).sendKeys("SoftwareTestingO");
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control#userEmail")).sendKeys("Blog");
		Thread.sleep(3000);
		driver.close();
	}
}