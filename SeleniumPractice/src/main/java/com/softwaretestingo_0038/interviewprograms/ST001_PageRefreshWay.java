package com.softwaretestingo_0038.interviewprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST001_PageRefreshWay 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
	}
}