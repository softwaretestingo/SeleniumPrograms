package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_CustomXpathParent 
{
	/*
	 * Selects the parent of the current node. 
	 * 
	 * ..-->> Represent Immediate Parent
	 * parent::<tagname> -->> Switch to Immediate or Respected Parent
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//label[@for='fname']/parent::form/parent::div/h1")).getText();
		System.out.println("The Text is: "+text);
		driver.quit();
	}
}