package com.softwaretestingo_0002.webdrivercommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST005_GetAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.id("autocomplete"));
		//class="inputs ui-autocomplete-input" this will give you the values of class attribute
		System.out.println(password.getAttribute("class")); //inputs ui-autocomplete-input
		driver.quit();
	}
}