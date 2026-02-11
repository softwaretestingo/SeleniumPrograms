package com.softwaretestingo_0014.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_FrameWithIndex 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		//switch to the Frame using Index
		driver.switchTo().frame(2);
		
		//Get the title
		String title=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Here Is the Page Title: "+title);
		
		driver.quit();		
	}
}