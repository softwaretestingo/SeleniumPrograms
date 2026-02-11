package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST015_SetSize 
{
	// This Will Help You Configure the Browser Size
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(300,500));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.quit();
	}
}