package com.softwaretestingo_0018.waits;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ST011_ExplicitWait_VisibilityOfElementLocated 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		
		By fullNameId=By.id("userName");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Select ExpectedConditions Class
		//Checking Wheather The Element is Visible and Present In the DOM Means Height & Weight Greater Then 0
		WebElement FullName = wait.until(ExpectedConditions.visibilityOfElementLocated(fullNameId));
		FullName.sendKeys("SoftwareTestingo");
		
		// You Can Remove Below Statement
		Thread.sleep(3000);
		driver.quit();
	}
}