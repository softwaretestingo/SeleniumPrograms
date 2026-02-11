package com.softwaretestingo_0005.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_AbsoluteXpath 
{
	/**
	 * Locating an Element using Absolute XPath
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2022/09/disabled-field-button.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/main/div/div/div/article/div/div/div[3]/div[1]/form/input[1]")).sendKeys("Softwaretestingo");
		Thread.sleep(3000);
		driver.quit();
	}
}