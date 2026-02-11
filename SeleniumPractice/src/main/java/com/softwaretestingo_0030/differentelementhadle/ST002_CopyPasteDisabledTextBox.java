package com.softwaretestingo_0030.differentelementhadle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_CopyPasteDisabledTextBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2022/09/disabled-field-button.html");
		Thread.sleep(2000);
		
		// Verify input box is copy disabled
		WebElement lastName = driver.findElement(By.name("lname"));
		lastName.sendKeys("SoftwareTestingo");
				
		String onCopyVal = lastName.getAttribute("oncopy");
		System.out.println("On copy value = "+onCopyVal);
		
		// Verify input box is paste disabled
		String onPasteVal = lastName.getAttribute("onpaste");
		System.out.println("On paste value = "+onPasteVal);
		
		driver.quit();
	}
}