package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST010_CustomXpathPreceedingSibling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']/preceding-sibling::input[@id='lname']")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();		
	}
}