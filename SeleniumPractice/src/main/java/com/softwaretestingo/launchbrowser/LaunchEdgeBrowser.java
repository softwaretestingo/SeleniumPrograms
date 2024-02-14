package com.softwaretestingo.launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class LaunchEdgeBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.close();
	}
}