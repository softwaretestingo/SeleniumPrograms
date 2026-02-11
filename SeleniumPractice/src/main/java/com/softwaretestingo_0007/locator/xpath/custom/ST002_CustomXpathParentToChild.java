package com.softwaretestingo_0007.locator.xpath.custom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_CustomXpathParentToChild 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(3000);
		String lblText = driver.findElement(By.xpath("//div[@id='post-body-1369437471207238134']/h1")).getText();
		System.out.println("Here are the Label Text: "+lblText);
		Thread.sleep(3000);
		driver.quit();
	}
}