package com.softwaretestingo_0014.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_FrameWithNameOrID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/frames.html");
		Thread.sleep(3000);
		
		//switch to the Frame using NameOrID
		driver.switchTo().frame("main");
		
		//Get the title
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Here Is the Page Title: "+title);
		
		driver.quit();		
	}
}