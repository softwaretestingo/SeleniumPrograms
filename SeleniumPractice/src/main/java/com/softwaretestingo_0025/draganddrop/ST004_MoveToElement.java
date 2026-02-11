package com.softwaretestingo_0025.draganddrop;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ST004_MoveToElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		
		WebElement srcElement=driver.findElement(By.linkText("password?"));
		
		Actions act=new Actions(driver);
		act.moveToElement(srcElement).contextClick().build().perform();
		act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).click().build().perform();
		Thread.sleep(3000);
		
		driver.quit();		
	}
}