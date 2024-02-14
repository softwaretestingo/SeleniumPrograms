package com.softwaretestingo.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameWithWebElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/frames.html");
		Thread.sleep(3000);
		WebElement mainFrame=driver.findElement(By.xpath("//frame[@name='main']"));
		
		//switch to the Frame using WebElement
		driver.switchTo().frame(mainFrame);
		
		//Get the title
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Here Is the Page Title: "+title);
		
		driver.close();		
	}
}