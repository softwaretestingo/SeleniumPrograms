package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_CSSWithAttributeMultipleCLASS 
{
	/**
	 * Finding An Element with CSS Selector Using Multiple Class Names
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		Thread.sleep(6000);
		/*You can use all the classes name but there should not be any space between the class names*/
		// If there are multiple classes then try to use minimal classes to locate the elements
		driver.findElement(By.cssSelector(".form-control.ng-pristine")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}