package com.softwaretestingo.normalizespace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NormalizeSpaceWithTextFunction 
{
	//div[text()[normalize-space() = 'Software TestingO']]
	
	//The above Two will Not Work
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/normalize-practice/");
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[text()[normalize-space() = 'space in beginning and end']]")).getText();
		System.out.println("Text: "+text);
		
		String text1 = driver.findElement(By.xpath("//div[normalize-space(text()) = 'space in beginning and end']")).getText();
		System.out.println("Text1: "+text1);
		
		String text2 = driver.findElement(By.xpath("//div[text()[normalize-space() = 'space in between']] ")).getText();
		System.out.println("Text2: "+text2);
		
		String text3 = driver.findElement(By.xpath("//div[normalize-space(text()) = 'space in between']")).getText();
		System.out.println("Text3: "+text3);
		
		String text4 = driver.findElement(By.xpath("//div[text()[normalize-space() = 'Software']]")).getText();
		System.out.println("Text4: "+text4);
		
		String text5 = driver.findElement(By.xpath("//div[text()[normalize-space() = 'www.softwaretestingo.com']]")).getText();
		System.out.println("Text5: "+text5);
		
		driver.close();
	}
}