package com.softwaretestingo_0001.launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_LaunchChromeBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}