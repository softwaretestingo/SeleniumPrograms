package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST010_GetClass 
{
	//This method helps you to find out which browser class or browser you are using
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		@SuppressWarnings("rawtypes")
		Class className= driver.getClass(); 
		System.out.println(className.getSimpleName());
		driver.quit();
	}
}