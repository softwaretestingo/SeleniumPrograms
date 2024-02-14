package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSLastChild 
{
	//When Multiple Elements Match That Time We Can Exclude Some Elements
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(3000);
		String lblText= driver.findElement(By.cssSelector("select#tools>option:last-child")).getText();
		System.out.println("The Label Text: "+lblText);
		driver.close();
	}
}