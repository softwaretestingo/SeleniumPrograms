package com.softwaretestingo.locator.xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathWithAbsoluteRelative 
{
	static WebElement email;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(3000);
		email=driver.findElement(By.xpath("//div[@id='userEmail-wrapper']/div[2]/input"));
		email.sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.close();
	}
}