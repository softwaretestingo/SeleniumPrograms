package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST011_CSSFirstChild 
{
	/**
	 * Locating an The First Child Element
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/09/dropdown.html");
		Thread.sleep(3000);
		String lblText= driver.findElement(By.cssSelector("#tools>option:first-child")).getText();
		System.out.println("The Label Text: "+lblText);
		driver.quit();
	}
}