package com.softwaretestingo_0030.differentelementhadle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_UseOfGetTextMethod 
{
	//GetText Will Not Work With the TextBox, It Will Only Work For Those element Where the Value is Already Available Inside the DOM
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.webocreation.com/en-gb?route=account/register");
		Thread.sleep(2000);
		
		WebElement first_name=driver.findElement(By.xpath("//label[@for='input-firstname']"));
		String text=first_name.getText();
		System.out.println("The Entered Value Is: "+text);
		Thread.sleep(4000);
		driver.quit();
	}
}