package com.softwaretestingo.seleniumexceptions;
import java.awt.AWTException;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FixStaleElementReferenceExceptionEx2 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebElement email;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);


		//List<WebElement> element=driver.findElements(By.xpath("//ul[@class='wp-block-latest-posts__list wp-block-latest-posts']/li[1]"));

		List<WebElement> element=driver.findElements(By.xpath("(//h5)[4]/following-sibling::p/a"));

		for(int i=0;i<element.size();i++) 
		{
			//After Click You Will Get StaleElementReferenceException On Next Iteration
			System.out.println(element.get(i).getText()); 
			element.get(i).click();
			Thread.sleep(3000); 
			
			//To Fix The StaleElementReferenceException you Need to Reinitialize the Element Once Again
			element=driver.findElements(By.xpath("(//h5)[4]/following-sibling::p/a"));
		}
		
		driver.quit();
	}
}