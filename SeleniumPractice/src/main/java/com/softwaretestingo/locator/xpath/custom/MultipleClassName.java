package com.softwaretestingo.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MultipleClassName 
{
	static WebElement textbox;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(2000);
		textbox=driver.findElement(By.xpath("//input[@class=' mr-sm-2 form-control']"));
		textbox.sendKeys("SoftwareTestingo Blog");
		Thread.sleep(2000);
		driver.close();
	}
}