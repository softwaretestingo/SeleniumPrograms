package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathFollowingSibling 
{
	/* Selects all following siblings of the current node. */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(3000);
		String lblText=driver.findElement(By.xpath("//select[@id='tools']/following-sibling::strong")).getText();
		System.out.println("The Label Text is: "+lblText);
		driver.close();		
	}
}