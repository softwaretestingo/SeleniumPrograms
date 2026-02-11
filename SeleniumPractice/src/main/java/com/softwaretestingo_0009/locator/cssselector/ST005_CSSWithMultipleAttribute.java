package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST005_CSSWithMultipleAttribute 
{
	/**
	 * Finding An Element with CSS Selector Using different multiple attributes
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/css-selector-adv-example.html");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='username'][name='username']")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}