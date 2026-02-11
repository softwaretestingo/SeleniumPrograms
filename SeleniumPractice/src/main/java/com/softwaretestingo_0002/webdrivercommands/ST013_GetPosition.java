package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST013_GetPosition 
{
	// This Will Retrun the Position (X & Y Axis) of your Browser
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		Point position=driver.manage().window().getPosition();
		System.out.println("Position Is: "+position);
		driver.quit();
	}
}