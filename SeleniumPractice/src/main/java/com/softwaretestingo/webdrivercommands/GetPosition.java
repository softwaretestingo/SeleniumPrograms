package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetPosition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		Point position=driver.manage().window().getPosition();
		System.out.println("Position Is: "+position);
		driver.close();
	}
}