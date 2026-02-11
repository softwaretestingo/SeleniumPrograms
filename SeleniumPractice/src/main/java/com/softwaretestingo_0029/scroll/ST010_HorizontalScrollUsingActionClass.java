package com.softwaretestingo_0029.scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ST010_HorizontalScrollUsingActionClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/horizontalscrollbar.html");
		Thread.sleep(2000);
		
		WebElement horizontalbar = driver.findElement(By.id("horizontalscrollbar") );
		Actions action = new Actions(driver);

		action.moveToElement(horizontalbar).click();
		for (int i = 0; i < 20; i++) 
		{
		    action.sendKeys(Keys.RIGHT).build().perform();
		    Thread.sleep(2000);
		}
		Thread.sleep(8000);
		driver.quit();
	}
}