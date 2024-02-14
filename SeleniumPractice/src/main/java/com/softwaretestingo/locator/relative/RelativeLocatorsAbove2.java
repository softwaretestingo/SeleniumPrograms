package com.softwaretestingo.locator.relative;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocatorsAbove2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		
		WebElement city=driver.findElement(By.xpath("(//a[text()='Nanaimo, Canada'])[1]"));
		
		//TagName indicates Which Type Element
		//above() - indicates above element of the given element
		String abovecity = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(city)).getText();	
		System.out.println(abovecity);
		Thread.sleep(3000);
		driver.close();
	}
}