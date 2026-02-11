package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST014_XPathSubstringAfter 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		String headingValue=driver.findElement(By.xpath("//label[substring-after(text(),\".\")=\"in\"]")).getAttribute("style");
		System.out.println("Last Heading Text Value: "+headingValue);
		driver.quit();
	}
}