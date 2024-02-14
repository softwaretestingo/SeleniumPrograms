package com.softwaretestingo.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XPathLast 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/static-table/");
		Thread.sleep(2000);
		String headingValue=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[last()]")).getText();
		System.out.println("Heading Text Value: "+headingValue);
		driver.close();
	}
}