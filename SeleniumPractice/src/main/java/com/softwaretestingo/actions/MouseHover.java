package com.softwaretestingo.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/mouse-hover/");
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.id("MouseHover"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		
		//Click on TestNg
		driver.findElement(By.linkText("TestNG")).click();
		
		driver.close();
	}
}