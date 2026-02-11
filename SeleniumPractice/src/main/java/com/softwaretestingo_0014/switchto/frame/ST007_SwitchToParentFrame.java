package com.softwaretestingo_0014.switchto.frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST007_SwitchToParentFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/09/nestedframes.html");
		Thread.sleep(3000);

		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test Text");
		
		//If You Directly Want to Switch Frame Then You Will Get NoSuchElementException
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.id("chkbox")).click();
		// SwitchTo Parent Frame
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SoftwareTestingO");
		Thread.sleep(3000);
		driver.quit();
	}
}