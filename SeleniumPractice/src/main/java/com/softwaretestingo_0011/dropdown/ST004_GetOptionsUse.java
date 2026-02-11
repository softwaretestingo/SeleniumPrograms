package com.softwaretestingo_0011.dropdown;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ST004_GetOptionsUse 
{
	/* @Author - SoftwareTestingo
	 * 
	 * Problem Statement
	 * 
	 * 1. Open the URL
	 * 2. Get all the Values Of Dropdown
	 * 3. Print All the Dropdown Values
	 * 4. Close the browser
	 * */
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select selectDropDown=new Select(dropdown);
			
		//Get All Option Values
		List<WebElement> dropdownValues= selectDropDown.getOptions();
		for(WebElement values:dropdownValues)
		{
			System.out.println(values.getText());
		}
		driver.quit();
	}
}