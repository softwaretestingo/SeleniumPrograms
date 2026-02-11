package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST012_XPathSubstring 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String headingValue=driver.findElement(By.xpath("//label[substring(text(),8,6)=\"Amazon\"]")).getAttribute("style");
		System.out.println("Last Heading Text Value: "+headingValue);
		driver.quit();
	}
}