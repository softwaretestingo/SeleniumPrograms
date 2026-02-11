package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_CustomXpathChild 
{
	// /..-->> Represent Immediate Parent
	// /child::<tagname> -->> Switch to Child
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		String fastNametext=driver.findElement(By.xpath("(//form[@method='get']/child::label)[position()=1]")).getText();
		System.out.println("The Firstname Label Text is: "+fastNametext);
		
		String lastNametext=driver.findElement(By.xpath("(//form[@method='get']/child::label)[position()=2]")).getText();
		System.out.println("The Lastname Label Text is: "+lastNametext);
		driver.quit();
	}
}