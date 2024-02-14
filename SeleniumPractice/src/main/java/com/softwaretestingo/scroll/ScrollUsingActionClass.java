package com.softwaretestingo.scroll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollUsingActionClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=product/product&language=en-gb&path=34&product_id=32");
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.CONTROL,Keys.END).build().perform();
		Thread.sleep(8000);
		act.sendKeys(Keys.CONTROL,Keys.HOME).build().perform();
		Thread.sleep(8000);
		
		driver.quit();
	}
}