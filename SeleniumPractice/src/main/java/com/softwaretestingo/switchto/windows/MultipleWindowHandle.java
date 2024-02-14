package com.softwaretestingo.switchto.windows;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/browser-windows/");
		Thread.sleep(3000);
		
		// Printing The Parent Window ID
		String parentWindowID=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowID);
		
		driver.findElement(By.id("windowButton")).click();
		
		//Sometime If the Execution Is Faster Then its not able to detect child windows so used sleep 
		Thread.sleep(3000);
		ArrayList<String> windowIDs= new ArrayList<String>( driver.getWindowHandles());
		System.out.println(windowIDs.size());
		for(String st:windowIDs)
		{
			System.out.println(st);
		}
		
		//Closing Parent Window Only
		driver.switchTo().window(windowIDs.get(0)).close();
		driver.quit();
	}

}
