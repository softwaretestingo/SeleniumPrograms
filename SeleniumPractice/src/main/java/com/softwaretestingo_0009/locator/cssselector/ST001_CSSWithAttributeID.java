package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_CSSWithAttributeID 
{
	/**
	 * Finding An Element with CSS Selector Using Tag Name and ID 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/css-selector-adv-example.html");
		Thread.sleep(3000);
		// You can Find the same Element With out Using Tagname, for that you can use #username
		driver.findElement(By.cssSelector("input#username")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}