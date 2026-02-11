package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST017_MultipleClassName 
{
	static WebElement textbox;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		textbox=driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
		textbox.sendKeys("SoftwareTestingo Blog");
		Thread.sleep(2000);
		driver.quit();
	}
}