package com.softwaretestingo_0029.scroll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST006_ScrollInfinite 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		long intialLength = (long) js.executeScript("return document.body.scrollHeight");

		while (true) 
		{
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			try 
			{
				Thread.sleep(4000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}

			long currentLength = (long) js.executeScript("return document.body.scrollHeight");
			if (intialLength == currentLength) 
			{
				break;
			}
			intialLength = currentLength;
		}
	}
}