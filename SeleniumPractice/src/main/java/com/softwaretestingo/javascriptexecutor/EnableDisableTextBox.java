package com.softwaretestingo.javascriptexecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EnableDisableTextBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/disabled-field-button/");
		Thread.sleep(3000);
		//Checking The Status of The Text Box
		boolean fbefore = driver.findElement(By.id("lname")).isEnabled();
		System.out.println("Before : Text box enabled status is : "+fbefore);

		//Enabling The disabled TextBox
		String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');";


		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		jsExecutor.executeScript(toenable);
		driver.findElement(By.id("lname")).sendKeys("SoftwareTestingO");		

		//Checking The Status of The Text Box
		boolean fafter = driver.findElement(By.id("lname")).isEnabled();
		System.out.println("After : Text box enabled status is : "+fafter);
		
		Thread.sleep(5000);
		driver.close();
	}
}