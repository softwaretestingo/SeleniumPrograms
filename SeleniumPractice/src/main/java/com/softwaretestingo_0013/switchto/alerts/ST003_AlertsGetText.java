package com.softwaretestingo_0013.switchto.alerts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_AlertsGetText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.hackerearth.com/javascript_alerts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println("The Alert Text Is: "+alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.quit();
	}
}