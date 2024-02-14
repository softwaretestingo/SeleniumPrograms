package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCurrentURL 
{	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		String currenturl= driver.getCurrentUrl();
		
		System.out.println("Current URL Is: "+currenturl);
		driver.close();
	}
}