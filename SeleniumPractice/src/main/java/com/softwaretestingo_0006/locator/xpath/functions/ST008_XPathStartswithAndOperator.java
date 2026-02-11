package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST008_XPathStartswithAndOperator 
{
	/**
	 * Locating an Element using starts-with() function with AND keyword 
	 * Note: AND should be Used with in the ;'
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/class-name-locator.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[starts-with(@alt,'Enter Your Name') and @id='email']")).sendKeys("Softwaretestingo");
		Thread.sleep(10000);
		driver.quit();
	}
}