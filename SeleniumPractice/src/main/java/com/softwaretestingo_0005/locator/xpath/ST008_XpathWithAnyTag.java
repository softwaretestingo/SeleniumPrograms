package com.softwaretestingo_0005.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST008_XpathWithAnyTag 
{
	/**
	 * Locating an Element Using Any Tags
	 */
	static WebElement userName;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath(".//input[@minlength='2']"));
		ele.sendKeys("SoftwareTestingo");
		Thread.sleep(3000);
		driver.quit();
	}
}