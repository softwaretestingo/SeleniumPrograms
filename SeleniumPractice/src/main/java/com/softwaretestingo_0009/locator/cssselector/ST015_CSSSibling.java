package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST015_CSSSibling 
{
	/**
	 * Locating Sibling Element Using CSS Selector
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[method='get']>label+input#fname")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}