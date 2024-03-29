package com.softwaretestingo.switchto.windows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/browser-windows/");
		Thread.sleep(3000);
		
		//Open a New Blank Tab [Introduced  in Selenium 4]
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		String newTabTitle=driver.getTitle();
		System.out.println("Title: "+newTabTitle);
		driver.quit();
	}
}