package com.softwaretestingo.draganddrop;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ClickAndHold 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//nav[@class='nav nav-tabs']/a)[2]")).click();

		WebElement srcElement = driver.findElement(By.xpath("//div[@id='restrictedX']"));
		WebElement destElement = driver.findElement(By.xpath("//div[@id='restrictedY']"));
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.clickAndHold(srcElement).moveToElement(destElement).release().build().perform();
		Thread.sleep(3000);
		
		driver.close();
	}
}