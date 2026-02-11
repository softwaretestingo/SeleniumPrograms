package com.softwaretestingo_0036.seleniumexceptions;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST017_FixStaleElementReferenceException 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebElement email;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/login");
		Thread.sleep(3000);
		email=driver.findElement(By.id("input-email"));
		email.sendKeys("SoftwareTestingO");
		driver.navigate().refresh();
		Thread.sleep(3000);
		// After Refresh Session ID Will Change So To Fix We Need to Reinitialize The Element
		email=driver.findElement(By.id("input-email"));
		email.sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}