	package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_XPathText 
{
	/**
	 * Locating an Element using text() function
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		String value = driver.findElement(By.xpath("//label[text()='First name:']")).getText();
		System.out.println("The Labelled Value: "+value);
		Thread.sleep(10000);
		driver.quit();
	}
}