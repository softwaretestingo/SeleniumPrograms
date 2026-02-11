package com.softwaretestingo_0018.waits;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ST007_ExplicitWait_TitleContains 
{
	//Here We Are Checking Partial Title
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/alerts/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// If Condition Fails You Will Get TimeoutException 
		wait.until(ExpectedConditions.titleContains("Alertss"));
		
		System.out.println("The Page Title: "+driver.getTitle());
		
		// You Can Remove Below Statement
		Thread.sleep(3000);
		driver.quit();
	}
}