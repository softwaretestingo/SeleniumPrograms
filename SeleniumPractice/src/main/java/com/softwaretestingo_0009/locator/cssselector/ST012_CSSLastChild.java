package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST012_CSSLastChild 
{
	/**
	 * Locating an The Last Child Element
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/09/dropdown.html");
		Thread.sleep(3000);
		String lblText= driver.findElement(By.cssSelector("select#tools>option:last-child")).getText();
		System.out.println("The Label Text: "+lblText);
		Thread.sleep(5000);
		driver.quit();
	}
}