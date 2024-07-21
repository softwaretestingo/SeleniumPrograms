package com.softwaretestingo.scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HorizontalScroll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebElement element;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/horizontalscrollbar.html");
		Thread.sleep(2000);
		
		element=driver.findElement(By.xpath("(//div[@class='column'])[22]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
		driver.close();
	}
}