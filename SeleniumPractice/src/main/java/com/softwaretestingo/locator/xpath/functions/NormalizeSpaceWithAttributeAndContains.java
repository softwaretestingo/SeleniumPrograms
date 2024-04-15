package com.softwaretestingo.locator.xpath.functions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NormalizeSpaceWithAttributeAndContains 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/normalize-practice/");
		Thread.sleep(3000);
		
		List<WebElement> texts = driver.findElements(By.xpath("//div[contains(normalize-space(@class),'my class')]"));
		for(int i=0;i<texts.size();i++)
		{
			System.out.println(texts.get(i).getText());
		}
		driver.close();
	}
}