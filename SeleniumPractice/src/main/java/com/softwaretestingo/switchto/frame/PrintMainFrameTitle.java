package com.softwaretestingo.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PrintMainFrameTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/frames.html");
		Thread.sleep(8000);
		WebElement element=driver.findElement(By.xpath("//frame[@src='top.html']"));
		driver.switchTo().frame(element);
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Here is the Page Title: "+title);
		driver.close();
	}
}