package com.softwaretestingo.interviewQuestionSolution;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BirlaSoftInterviewQuestions 
{
	/*
	 *Problem Statement
	 * 
	 * Go to the Flipkart page and select the electronic category.
	 * Take that as your root element and select the Flipkart logo with that element.
	 * Go to Flipkart home page
	 * Search for iPhone and from the auto-suggestion list select iPhone 15 pro
	 * 
	 * @author Aparna
	 * Thanks To Aparna For Sharing the Solution
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebDriverWait ww= new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
		
		//print logo title.
		WebElement a=  driver.findElement(By.xpath("//span[contains(text(),'Electronics')]/ancestor::div//div/a/picture"));
		System.out.println(a);
		System.out.println(a.getAttribute("title"));
		
		//this as electronics page hides option
		Actions action= new Actions(driver);
		WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		action.moveToElement(searchbox).perform();
		
		searchbox.sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//input[@placeholder='Search for Products, Brands and More']/parent::div/parent::div/following-sibling::ul/li/div/a"));
		//Thread.sleep(5000);
		for(WebElement we : li) 
		{
			//System.out.println(we.getAttribute("href"));
			if(we.getAttribute("href").contains("iphone+15+pro")) 
			{
				System.out.println(we.getAttribute("href"));
				ww.until(ExpectedConditions.elementToBeClickable(we)).click();
				break;
			}
		}
	}
}