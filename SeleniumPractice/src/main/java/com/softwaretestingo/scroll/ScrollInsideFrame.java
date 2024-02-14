package com.softwaretestingo.scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInsideFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/scrollingframetest.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("nested_scrolling_frame");
		WebElement element=driver.findElement(By.name("scroll_checkbox"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		element.click();
		Thread.sleep(3000);
		driver.close();
	}
}