package com.softwaretestingo_0014.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_FindTotalNoOfFrames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		int totalFrame = driver.findElements(By.tagName("frame")).size();
		System.out.println("Total Number Of Frames: "+totalFrame);
		driver.quit();
	}
}