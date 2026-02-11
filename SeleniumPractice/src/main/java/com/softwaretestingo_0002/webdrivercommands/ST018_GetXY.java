package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST018_GetXY 
{
	// Return the Browser Staring Point of X & Y Axes
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		int X=driver.manage().window().getPosition().getX();
		int Y=driver.manage().window().getPosition().getY();
		System.out.println("The X & Y Cordinates is: "+ "( "+X+", "+Y+")");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.quit();
	}
}