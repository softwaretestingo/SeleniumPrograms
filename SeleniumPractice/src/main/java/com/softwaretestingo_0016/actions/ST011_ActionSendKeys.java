package com.softwaretestingo_0016.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ST011_ActionSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("user")).sendKeys("SoftwareTestingo");
		
		//implementing Actions Class
		// Actions Class SendKeys Will Click On the Element Then Send The Value
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys("Password").build().perform();
		Thread.sleep(3000);
		driver.quit();
	}
}