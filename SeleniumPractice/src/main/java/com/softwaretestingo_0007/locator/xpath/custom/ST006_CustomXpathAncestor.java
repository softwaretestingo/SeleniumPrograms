package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST006_CustomXpathAncestor 
{
	/*
	 * Selects all ancestors of the current node.
	 * 
	 * /..-->> Represent Immediate Parent 
	 * /parent::<tagname> -->> Switch to Immediate or Respected Parent 
	 * /ancestor::<tagname> -->> [This will select parent,grandparent and great-grandparent tags]
	 * 							 Switch to Respected Parent Tag
	 * /ancestor-or-self::<tagname> -->> [This will select parent,grandparent and great-grandparent tags,
	 * 									 self] 
	 */
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/invalidselectorexception-in-selenium.html");
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("(//input[@id='textone']/ancestor::div)[10]/div[1]/h3")).getText();
		System.out.println("The Text is: "+text);
		driver.quit();
	}
}