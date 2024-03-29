package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CustomXpathDescendant 
{
	/*
	 * Selects all descendants (children, grandchildren, etc.) of the current node.
	 * /..-->> Represent Immediate Parent /child::<tagname> -->> Switch to Child
	 * /descendant::* -->> Represent children, grandchildren, GreatGrandChildren
	 * /descendant-or-self::* -->> Represent children, grandchildren,GreatGrandChildren & Self
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(2000);

		//Display Bold Text
		String boldText=driver.findElement(By.xpath("(//div[@class='dropdownselenium']/descendant::Strong)[1]")).getText();
		System.out.println("Printing First Bold Text: "+boldText);
		driver.close();
	}
}