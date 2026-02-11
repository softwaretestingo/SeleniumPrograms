package com.softwaretestingo_0008.locator.relative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class ST005_RelativeLocatorstoRightOf 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		
		WebElement btnCancel=driver.findElement(By.xpath("//button[@value='Submit']"));
		String text=driver.findElement(RelativeLocator.with(By.tagName("button"))
            	.toRightOf(btnCancel)).getText();
		System.out.println("Button Text: "+text);
		Thread.sleep(3000);
		driver.quit();
	}
}