package com.softwaretestingo_0015.switchto.windows;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_PerformOperationInChildWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/browser-windows/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
		
		//Switch to Child Windows
		driver.switchTo().window(al.get(1));
		String texts=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		System.out.println(texts);
		driver.quit();
		
		//Return to Parent Window
		driver.switchTo().window(al.get(0));
		String parentWindowTitle=driver.getTitle();
		System.out.println("Parent Window Page Title: "+parentWindowTitle);
		driver.quit();
	}
}