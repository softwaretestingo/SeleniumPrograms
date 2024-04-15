package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathWithVariable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/static-table/");
		Thread.sleep(2000);
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afterXpath="]/td[1]";
		
		//Print All the Company Names
		for(int row=2;row<=7; row++)
		{
			String fullXpath=beforeXpath+row+afterXpath;
			String value=driver.findElement(By.xpath(fullXpath)).getText();
			System.out.println("The Company Name: "+value);
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}