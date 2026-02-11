package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST008_NoSuchFrameException 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(5000);

		driver.switchTo().frame(2);
	}
}