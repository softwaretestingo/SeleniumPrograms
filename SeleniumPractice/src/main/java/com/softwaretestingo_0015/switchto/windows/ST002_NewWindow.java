package com.softwaretestingo_0015.switchto.windows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_NewWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.com/");
		Thread.sleep(3000);
		
		//Open a New Blank Window [Introduced  in Selenium 4]
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		String newTabTitle=driver.getTitle();
		System.out.println("Title: "+newTabTitle);
		Thread.sleep(4000);
		driver.quit();
	}
}