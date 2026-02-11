package com.softwaretestingo_0007.locator.xpath.custom;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST016_CustomXpathWithVariable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");
		Thread.sleep(2000);
		List<WebElement> totalRow= driver.findElements(By.xpath("//tr"));
		int size=totalRow.size();
		String beforeXpath="//table[@name='BookTable']/tbody/tr[";
		String afterXpath="]/td[3]";
		
		//Print All the Subject Names
		for(int row=2;row<=size; row++)
		{
			String fullXpath=beforeXpath+row+afterXpath;
			String value=driver.findElement(By.xpath(fullXpath)).getText();
			System.out.println("The Course Name: "+value);
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}