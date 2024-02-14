package com.softwaretestingo.locator.relative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocatorsNear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		
		WebElement txtboxUserName=driver.findElement(By.id("user"));
		WebElement text=driver.findElement(RelativeLocator.with(By.tagName("label")).near(txtboxUserName));
		System.out.println("Button Text: "+text.getText());
		Thread.sleep(3000);
		driver.close();
	}
}