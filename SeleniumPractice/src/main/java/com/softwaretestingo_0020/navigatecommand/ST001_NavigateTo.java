package com.softwaretestingo_0020.navigatecommand;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_NavigateTo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.softwaretestingo.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}