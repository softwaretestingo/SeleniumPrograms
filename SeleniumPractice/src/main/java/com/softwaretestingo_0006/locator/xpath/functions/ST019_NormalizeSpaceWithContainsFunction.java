package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST019_NormalizeSpaceWithContainsFunction 
{
	//The above Two will Not Work
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/normalize-practice/");
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("(//div[contains(normalize-space(),'space in beginning and')])[6]")).getText();
		System.out.println("Text: "+text);
		
		String text1 = driver.findElement(By.xpath("(//div[contains(normalize-space(),'space in')])[7]")).getText();
		System.out.println("Text1: "+text1);
		
		String text2 = driver.findElement(By.xpath("(//div[contains(normalize-space(),'Software TestingO')])[6]")).getText();
		System.out.println("Text2: "+text2);
		
		String text3 = driver.findElement(By.xpath("(//div[contains(normalize-space(),'Software TestingO Blog www.softwaretestingo.com')])[6]")).getText();
		System.out.println("Text3: "+text3);
		driver.quit();
	}
}