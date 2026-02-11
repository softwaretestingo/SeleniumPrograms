package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST014_GetSize 
{
	// Retrun the Browser Size
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		Dimension size=driver.manage().window().getSize();
		System.out.println("Size of the Current Window: "+size);
		driver.quit();
	}
}