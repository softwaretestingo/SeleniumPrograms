package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetXY 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		int X=driver.manage().window().getPosition().getX();
		int Y=driver.manage().window().getPosition().getY();
		System.out.println("The X & Y Cordinates is: "+ "( "+X+", "+Y+")");
		driver.get("https://demo.softwaretestingo.com/");
		driver.manage().window().maximize();
		driver.close();
	}
}