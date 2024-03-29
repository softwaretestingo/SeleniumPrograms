package com.softwaretestingo.checkbox;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTextBoxSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement txtbox=driver.findElement(By.id("userName"));
		Dimension size=txtbox.getSize();

		System.out.println("Height: "+size.getHeight());
		System.out.println("Width: "+size.getWidth());
		driver.quit();
	}
}