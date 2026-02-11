package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST005_CustomXpathDescendant 
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
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);

		//Display First Button Text
		String buttonText=driver.findElement(By.xpath("(//form[@method='get']/child::button)[position()=1]")).getText();
		System.out.println("Printing First Bold Text: "+buttonText);
		driver.quit();
	}
}