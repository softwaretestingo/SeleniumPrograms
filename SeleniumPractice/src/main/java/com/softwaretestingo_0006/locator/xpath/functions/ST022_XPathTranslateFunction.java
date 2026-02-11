package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST022_XPathTranslateFunction 
{
	/*
	 * In XPath is used to replace characters in a string with other characters.
	 * It's particularly useful for handling cases where elements have dynamic IDs
	 * or classes that need to be normalized for consistent selection.
	 */	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//h1[contains(translate(text(), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'the button type attribute')]"));
		String text=ele.getText();
		System.out.println(text);
	}
}