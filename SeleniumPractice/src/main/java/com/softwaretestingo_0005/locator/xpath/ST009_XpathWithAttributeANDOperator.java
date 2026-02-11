package com.softwaretestingo_0005.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST009_XpathWithAttributeANDOperator 
{
	/**
	 * Locating an Element Multiple Attribute With AND Keyword
	 */
	static WebElement userName;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		userName=driver.findElement(By.xpath("//input[@id='fname' and @name='fname' ]"));
		userName.sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}