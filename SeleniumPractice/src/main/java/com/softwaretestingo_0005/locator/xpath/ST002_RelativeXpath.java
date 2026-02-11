package com.softwaretestingo_0005.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_RelativeXpath 
{
	/**
	 * Locating an Element using Relative XPath
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@method='get']/input[@id='fname']")).sendKeys("Software");
		Thread.sleep(3000);
		driver.quit();
	}
}