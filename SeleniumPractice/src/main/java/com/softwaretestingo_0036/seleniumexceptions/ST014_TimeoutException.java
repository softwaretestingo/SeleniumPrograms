package com.softwaretestingo_0036.seleniumexceptions;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ST014_TimeoutException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/alerts/");
		
		By BtnTimerAlertButtonId=By.id("timerAlertButton");
		driver.findElement(BtnTimerAlertButtonId).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		//With In 1 Second the Alert Will Not Appear So You Will Get TimeoutException
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		
		alert.accept();
		
		// You Can Remove Below Statement
		Thread.sleep(3000);
		driver.quit();
	}
}