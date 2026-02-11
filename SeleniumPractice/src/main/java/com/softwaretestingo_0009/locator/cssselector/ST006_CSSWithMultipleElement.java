package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST006_CSSWithMultipleElement 
{
	/**
	 * Finding Multiple Element with CSS Selector
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		// This Will Select Submit & Reset Button But Print First Button Text Which is Submit
		String btnText=driver.findElement(By.cssSelector("[value='Submit'], [value='Reset']")).getText();
		System.out.println("The Button Text: "+btnText);
		Thread.sleep(3000);
		driver.quit();
	}
}