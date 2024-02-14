package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(300,500));
		driver.get("https://demo.softwaretestingo.com");
		Thread.sleep(5000);
		driver.close();
	}
}