package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoSuchSessionException 
{
	/**
	 * After Closing the Browser if you perform any operation then that time you will get No Such Exception
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("user")).sendKeys("Testing");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		Thread.sleep(3000);
		driver.findElement(By.id("user")).sendKeys("TestingBlog");
		Thread.sleep(3000);
		driver.close();
	}
}