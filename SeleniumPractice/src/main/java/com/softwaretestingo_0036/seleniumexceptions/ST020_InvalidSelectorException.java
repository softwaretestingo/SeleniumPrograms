package com.softwaretestingo_0036.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST020_InvalidSelectorException 
{
	/**
	 * //InvalidSelectorException: Wrong Xpath Syntax
	 * Reason: Passing Wrong Xpath Syntax
	 * Solution: Write the Correct Syntax
	 */
	static WebElement textbox;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(2000);
		textbox=driver.findElement(By.xpath("//input[@@@@id='userName']"));
		textbox.sendKeys("SoftwareTestingo Blog");
		Thread.sleep(2000);
		driver.quit();
	}
}