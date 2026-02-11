package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST011_XPathLast 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/09/dropdown.html");
		Thread.sleep(2000);
		String lastValue=driver.findElement(By.xpath("(//select[@id='tools']/option)[last()]")).getText();
		System.out.println("Last Heading Text Value: "+lastValue);
		driver.quit();
	}
}