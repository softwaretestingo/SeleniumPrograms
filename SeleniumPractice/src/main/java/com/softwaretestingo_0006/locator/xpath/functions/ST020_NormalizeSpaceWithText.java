package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST020_NormalizeSpaceWithText 
{
	//div[contains(text(),'Software TestingO')]
	//div[contains(text(),'Software TestingO Blog www.softwaretestingo.com')]
	//The above Two will Not Work
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/normalize-practice/");
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'space in beginning and end')]")).getText();
		System.out.println("Text: "+text);
		
		String text1 = driver.findElement(By.xpath("//div[contains(text(),' space      in             between ')]")).getText();
		System.out.println("Text1: "+text1);
		
		driver.quit();
	}
}