package com.softwaretestingo_0005.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_XpathWithAttributeID 
{
	/**
	 * Locating an Element using Using ID Attribute
	 */
	static WebElement userName;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/css-selector-adv-example.html");
		Thread.sleep(3000);
		userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}