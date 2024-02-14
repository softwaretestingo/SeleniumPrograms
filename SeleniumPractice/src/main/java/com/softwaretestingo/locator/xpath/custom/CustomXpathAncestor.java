package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathAncestor 
{
	// /..-->> Represent Immediate Parent
	// /parent::<tagname> -->> Switch to Immediate or Respected Parent
	// /ancestor::<tagname> -->> [This will select parent,grandparent and great-grandparent tags] Switch to Respected Parent Tag
	// /ancestor-or-self::<tagname> -->> [This will select parent,grandparent and great-grandparent tags, self] 
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//label[@for='psw']/parent::div")).getText();
		System.out.println("The Text is: "+text);
		driver.close();
	}
}