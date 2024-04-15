package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InvalidSelectorException1 
{
	/**
	 * InvalidSelectorException: 
	 * 
	 * Reason: When there are multiple classes in the value that time if you use ClassName Locator then you will get InvalidSelectorException
	 * Solution: You can use those multiple classes with Xpath //input[@class,'value1 value 2']
	 */
	static WebElement textbox;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(2000);
		//InvalidSelectorException: Compound class names not permitted
		textbox=driver.findElement(By.className("mr-sm-2 form-control"));
		textbox.sendKeys("SoftwareTestingo Blog");
		Thread.sleep(2000);
		driver.close();
	}
}