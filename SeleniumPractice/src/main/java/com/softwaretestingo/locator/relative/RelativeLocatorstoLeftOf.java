package com.softwaretestingo.locator.relative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocatorstoLeftOf 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		
		WebElement btnLogin=driver.findElement(By.id("submitbtn"));
		String text=driver.findElement(RelativeLocator.with(By.tagName("button"))
            	.toLeftOf(btnLogin)).getText();
		System.out.println("Button Text: "+text);
		Thread.sleep(3000);
		driver.close();
	}
}