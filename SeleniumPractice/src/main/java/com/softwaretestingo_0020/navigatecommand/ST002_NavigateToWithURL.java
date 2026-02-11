package com.softwaretestingo_0020.navigatecommand;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_NavigateToWithURL 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.softwaretestingo.com/"));
		Thread.sleep(2000);
		driver.quit();
	}
}