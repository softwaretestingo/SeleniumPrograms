package com.softwaretestingo.javascriptexecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DrawBorder 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=product/category&language=en-gb&path=34");
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("(//div[@class='description']/h4)[4]/a"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		Thread.sleep(3000);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
		Thread.sleep(3000);
		driver.close();

	}

}
