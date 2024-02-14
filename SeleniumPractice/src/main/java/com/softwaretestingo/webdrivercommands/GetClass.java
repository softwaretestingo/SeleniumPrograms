package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GetClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		Class className= driver.getClass(); 
		System.out.println(className.getSimpleName());
		driver.close();
	}
}