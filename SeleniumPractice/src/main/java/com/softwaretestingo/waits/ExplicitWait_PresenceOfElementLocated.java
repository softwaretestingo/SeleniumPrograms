package com.softwaretestingo.waits;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait_PresenceOfElementLocated 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		
		By fullNameId=By.id("userName");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Select ExpectedConditions Class
		// Checking Weather The Element is Visible in The DOM, Visible Means Height& Width > 0
		WebElement FullName = wait.until(ExpectedConditions.presenceOfElementLocated(fullNameId));
		FullName.sendKeys("SoftwareTestingo");
		
		// You Can Remove Below Statement
		Thread.sleep(3000);
		driver.close();
	}
}