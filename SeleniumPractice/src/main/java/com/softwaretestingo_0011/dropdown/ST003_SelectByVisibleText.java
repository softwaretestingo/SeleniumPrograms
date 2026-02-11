package com.softwaretestingo_0011.dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ST003_SelectByVisibleText 
{
	/* @Author - SoftwareTestingo
	 * 
	 * Problem Statement
	 * 
	 * 1. Open the URL
	 * 2. Select Value by using selectByVisibleText()
	 * 3. Close the browser
	 * */
	static String URL="https://demo.softwaretestingo.com/dropdown/";
	static WebElement dropdown;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		dropdown=driver.findElement(By.id("tools"));
		
		Select s=new Select(dropdown);
		s.selectByVisibleText("Docker");
		Thread.sleep(2000);
		driver.quit();
	}
}