package com.softwaretestingo_0001.launchbrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ST002_LaunchEdgeBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}