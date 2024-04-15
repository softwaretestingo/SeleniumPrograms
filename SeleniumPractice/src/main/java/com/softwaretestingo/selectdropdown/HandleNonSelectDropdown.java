package com.softwaretestingo.selectdropdown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleNonSelectDropdown 
{
	/* @Author - SoftwareTestingo
	 * 
	 * Problem Statement
	 * 
	 * 1. Open the URL of Angular Dropdown
	 * 2. Get all the Values Of Dropdown
	 * 3. Print All the Dropdown Values
	 * 4. Select Pizza Value
	 * 5. Close the browser
	 * */
	public static void main(String[] args) throws InterruptedException 
	{
		
		String url="https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1";
		WebElement dropDown;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
				
		dropDown=driver.findElement(By.id("btnDropdownDemo"));
		dropDown.click();
		List<WebElement> allValues=driver.findElements(By.xpath("//div[@aria-labelledby='btnDropdownDemo']/a"));
		for(WebElement value:allValues)
		{
			System.out.println(value.getText());
		}
		driver.quit();
	}
}