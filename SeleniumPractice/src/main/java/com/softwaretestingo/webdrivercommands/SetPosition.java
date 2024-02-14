package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new Point(50,200));
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.close();
	}
}