package com.softwaretestingo.normalizespace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NormalizeSpaceWithAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/normalize-practice/");
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[normalize-space(@class)='my class 1']")).getText();
		System.out.println("Text: "+text);
		
		String text1 = driver.findElement(By.xpath("//div[normalize-space(@class)='my class 2']")).getText();
		System.out.println("Text1: "+text1);
		//div[normalize-space(@class)='my class 2']
		driver.close();
	}
}