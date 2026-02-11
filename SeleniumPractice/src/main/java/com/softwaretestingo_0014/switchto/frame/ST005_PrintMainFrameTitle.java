package com.softwaretestingo_0014.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST005_PrintMainFrameTitle 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(8000);
		WebElement element=driver.findElement(By.xpath("//frame[@src='top.html']"));
		driver.switchTo().frame(element);
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Here is the Page Title: "+title);
		driver.quit();
	}
}