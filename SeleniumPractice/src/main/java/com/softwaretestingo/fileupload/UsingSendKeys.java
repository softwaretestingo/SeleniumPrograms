package com.softwaretestingo.fileupload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/upload-download/");
		Thread.sleep(3000);
		driver.findElement(By.id("uploadFile")).sendKeys("D:\\Workspace\\Automation\\SeleniumPractice\\Resources\\SoftwareTestingO.png");
		Thread.sleep(3000);
		driver.close();
	}
}