package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST008_CSSWithAttributeNot 
{
	/**
	 * When Multiple Elements Match with CSS Selector That Time We Can Exclude Some Elements
	 * By Using NOT 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		String lblText= driver.findElement(By.cssSelector("[method='get']>label:not(label[for='lname'])")).getText();
		System.out.println("The Label Text: "+lblText);
		driver.quit();
	}
}