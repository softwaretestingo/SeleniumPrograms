package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST005_XPathPositionWithCondition 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/09/dropdown.html");
		Thread.sleep(2000);
		String course=driver.findElement(By.xpath("(//select[@id='tools']/option)[position()>3]")).getText();
		System.out.println("The Selected Course Name is: "+course);
		Thread.sleep(3000);
		driver.quit();
	}
}