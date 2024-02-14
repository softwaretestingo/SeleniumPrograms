package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSSibling 
{
	//When Multiple Elements Match That Time We Can Exclude Some Elements
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("label[for='uname']+input#user")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.close();
	}
}