package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST009_CSSWithAttributeStarsWith 
{
	/**
	 * Locating an Element Using Wild Character (^) which represents for Starts With
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder ^='email']")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}