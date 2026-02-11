package com.softwaretestingo_0014.switchto.frame;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST008_CapegeminiInterviewQuestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/09/nestedframes.html");
		Thread.sleep(3000);
		List<WebElement> allframes=driver.findElements(By.xpath("//iframe"));
		int size=allframes.size();
		System.out.println(size);
		driver.switchTo().frame("frame1");
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.xpath("//input[@id='chkbox']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}