package com.softwaretestingo.table;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintTableColumnHeadings 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/static-table/");
		Thread.sleep(2000);
		
		List<WebElement> al=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Column Heading "+i+": "+al.get(i).getText());
		}
		
		Thread.sleep(3000);
		driver.close();			
	}
}