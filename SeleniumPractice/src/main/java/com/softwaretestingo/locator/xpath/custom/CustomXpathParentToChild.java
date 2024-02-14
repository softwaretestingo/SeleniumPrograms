package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathParentToChild 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(3000);
		String lblText = driver.findElement(By.xpath("//div[@id='userName-wrapper']/div/label")).getText();
		System.out.println("Here are the Label Text: "+lblText);
		Thread.sleep(3000);
		driver.close();
	}
}