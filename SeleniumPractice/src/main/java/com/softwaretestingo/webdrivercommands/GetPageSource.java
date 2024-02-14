package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetPageSource 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		String pagesource=driver.getPageSource();
		System.out.println("Here is the Complete PageSource: "+pagesource);
		driver.close();
	}
}