package com.softwaretestingo_0020.navigatecommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST004_NavigateBack 
{
	static String URL="https://demo.softwaretestingo.com/";
	static WebElement WebTable;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		Thread.sleep(2000);
		WebTable=driver.findElement(By.linkText("WebTable"));
		WebTable.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.quit();
	}
}