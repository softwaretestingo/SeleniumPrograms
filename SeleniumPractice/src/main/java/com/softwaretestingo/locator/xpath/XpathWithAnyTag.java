package com.softwaretestingo.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathWithAnyTag 
{
	static WebElement userName;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/locator-practice/");
		Thread.sleep(3000);
		userName=driver.findElement(By.xpath("//*[@id='username']"));
		userName.sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.close();
	}
}