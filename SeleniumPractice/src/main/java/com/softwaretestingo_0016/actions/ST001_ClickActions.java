package com.softwaretestingo_0016.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ST001_ClickActions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/links/");
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.cssSelector("a#simpleLink"));
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(3000);

		// This will close only Parent Tab
		//driver.quit();
		
		// This Will Close All The Tabs
		driver.quit();
	}
}