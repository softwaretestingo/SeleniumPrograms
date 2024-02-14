package com.softwaretestingo.switchto.alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsGetText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/alerts/");
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println("The Alert Text Is: "+alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}
}