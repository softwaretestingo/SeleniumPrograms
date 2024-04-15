package com.softwaretestingo.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class WriteInCapitalLetter 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);

		WebElement username=driver.findElement(By.id("user"));
		Actions act=new Actions(driver);
		act.keyDown(username, Keys.LEFT_SHIFT).sendKeys("manoj").build().perform();
		
		driver.quit();
	}
}