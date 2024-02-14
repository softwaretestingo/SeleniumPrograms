package com.softwaretestingo.webdrivercommands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		Dimension size=driver.manage().window().getSize();
		System.out.println("Size of the Current Window: "+size);
		driver.close();
	}
}