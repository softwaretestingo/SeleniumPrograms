package com.softwaretestingo.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AbsoluteXpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.close();
	}
}