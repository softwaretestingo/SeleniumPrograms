package com.softwaretestingo_0016.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ST012_FindLocationOfElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/links/");
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.cssSelector("a#simpleLink"));
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		
		Actions act=new Actions(driver);
		act.moveByOffset(x, y).build().perform();
		System.out.println("X: "+x+ " Y: "+y);
		driver.quit();
	}
}