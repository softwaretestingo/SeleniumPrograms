package com.softwaretestingo_0004.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_ClassName 
{
	static WebElement textbox;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Thread.sleep(2000);
		textbox=driver.findElement(By.className("form-control"));
		textbox.sendKeys("SoftwareTestingo Blog");
		Thread.sleep(2000);
		driver.quit();
	}
}