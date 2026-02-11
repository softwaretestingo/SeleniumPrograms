package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST009_GetCurrentURL 
{	
	// This Will return the current URL
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String currenturl= driver.getCurrentUrl();
		
		System.out.println("Current URL Is: "+currenturl);
		driver.quit();
	}
}