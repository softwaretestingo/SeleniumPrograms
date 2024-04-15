package com.softwaretestingo.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeyBoardActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropdown/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("tools")).click();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		Thread.sleep(6000);
		driver.quit();
	}
}