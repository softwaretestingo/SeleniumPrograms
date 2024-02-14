package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathPreceeding 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(3000);
		String lblText=driver.findElement(By.xpath("(//select)[1]/preceding::strong")).getText();
		System.out.println("The Label Text is: "+lblText);
		driver.close();		
	}
}