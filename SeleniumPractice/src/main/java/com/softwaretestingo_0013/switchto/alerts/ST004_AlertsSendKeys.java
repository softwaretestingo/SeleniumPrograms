package com.softwaretestingo_0013.switchto.alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_AlertsSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.hackerearth.com/javascript_alerts");
		
		// This step will result in an alert on screen
		WebElement element = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		element.click();
		Thread.sleep(3000);
		
		Alert promptAlert  = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		Thread.sleep(3000);
		System.out.println("Alert text is :" + alertText);
		
		//Send some text to the alert
		promptAlert.sendKeys("Test User");
		Thread.sleep(3000);
		promptAlert.accept();
		Thread.sleep(3000);
		
		driver.quit();
	}
}