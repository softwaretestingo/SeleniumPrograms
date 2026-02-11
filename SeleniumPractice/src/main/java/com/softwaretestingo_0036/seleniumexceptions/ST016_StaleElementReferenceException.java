package com.softwaretestingo_0036.seleniumexceptions;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST016_StaleElementReferenceException 
{
	/**
	 * StaleElementReferenceException: When we refresh the page then the reference got updated with new reference thats why we are getting StaleElementReferenceException
	 * Solution: You need to initialize the element again
	 * @param args
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/login");
		WebElement email=driver.findElement(By.id("input-email"));
		Thread.sleep(3000);
		email.sendKeys("SoftwareTestingO");
		driver.navigate().refresh();
		email.sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
	}
}