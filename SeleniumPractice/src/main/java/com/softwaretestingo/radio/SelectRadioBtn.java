package com.softwaretestingo.radio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioBtn 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/radio/");
		Thread.sleep(2000);
		List<WebElement> course=driver.findElements(By.id("courses"));
		
		//Select Selenium Courses
		course.get(3).click();
		Thread.sleep(3000);
		driver.close();
	}
}