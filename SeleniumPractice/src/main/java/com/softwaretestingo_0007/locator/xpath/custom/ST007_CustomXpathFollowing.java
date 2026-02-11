package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST007_CustomXpathFollowing 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[contains(text(),'First')]/following::input)[1]")).sendKeys("SofwareTestingO");
		Thread.sleep(3000);
		driver.quit();		
	}
}