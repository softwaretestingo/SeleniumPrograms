package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST014_CSSParentToChildWithSpace 
{
	/**
	 * Locating an Element Using Traverse From Parent To Child Using Space and > Symbol
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		String lbluname=driver.findElement(By.cssSelector("[method='get'] label")).getText();
		String lblpwd=driver.findElement(By.cssSelector("[method='get']>label:nth-of-type(2)")).getText();
		System.out.println("Label Text For UserName: "+lbluname);
		System.out.println("Label Text For Password: "+lblpwd);
		driver.quit();
	}
}