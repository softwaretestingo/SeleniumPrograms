package com.softwaretestingo_0011.dropdown;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST007_HandleAutoSuggestion 
{
	/* @Author - SoftwareTestingo
	 * 
	 * Problem Statement
	 * 
	 * 1. Open the URL
	 * 2. Search For SoftwareTestingo
	 * 3. Print All the Auto Suggestion Dropdown Values
	 * 4. Search softwaretestingo manual test cases
	 * 4. Close the browser
	 * */
	public static void main(String[] args) throws InterruptedException 
	{
		//Handle Auto Suggestion List
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("SoftwareTestingo");
		
		//Sometime This Xpath May Not Work
		List<WebElement> values=driver.findElements(By.xpath("//*[@role='presentation' and @class='wM6W7d']"));
		for(WebElement value:values)
		{
			System.out.println(value.getText());
			if(value.getText().equalsIgnoreCase("softwaretestingo manual test cases"))
			{
				value.click();
			}
		}
		driver.quit();
	}
}