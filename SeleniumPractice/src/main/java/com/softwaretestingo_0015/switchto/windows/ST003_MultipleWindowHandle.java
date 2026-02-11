package com.softwaretestingo_0015.switchto.windows;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_MultipleWindowHandle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.hackerearth.com/windows");
		Thread.sleep(3000);
		
		// Printing The Parent Window ID
		String parentWindowID=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentWindowID);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//Sometime If the Execution Is Faster Then its not able to detect child windows so used sleep 
		Thread.sleep(3000);
		ArrayList<String> windowIDs= new ArrayList<String>( driver.getWindowHandles());
		System.out.println(windowIDs.size());
		for(String st:windowIDs)
		{
			System.out.println(st);
		}
		
		//Closing Child Window Only
		driver.switchTo().window(windowIDs.get(1));
		driver.quit();
		Thread.sleep(3000);
		
		driver.quit();
	}
}