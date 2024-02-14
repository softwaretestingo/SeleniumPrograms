package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetWidthHeight 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		System.out.println("Width of window: "+ driver.manage().window().getSize().getWidth()); 
		System.out.println("Height of window: "+driver.manage().window().getSize().getHeight());
		driver.close();
	}
}