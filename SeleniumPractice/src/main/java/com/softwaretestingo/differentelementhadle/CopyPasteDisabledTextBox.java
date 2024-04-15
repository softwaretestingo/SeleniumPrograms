package com.softwaretestingo.differentelementhadle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CopyPasteDisabledTextBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/copy-paste-disabled-textbox/");
		Thread.sleep(2000);
		
		// Verify input box is copy disabled
		WebElement txtBoxAccountNumber = driver.findElement(By.name("ReceiveNo"));
		txtBoxAccountNumber.sendKeys("SoftwareTestingo");
				
		String onCopyVal = txtBoxAccountNumber.getAttribute("oncopy");
		System.out.println("On copy value = "+onCopyVal);
		
		// Verify input box is paste disabled
		String onPasteVal = txtBoxAccountNumber.getAttribute("onpaste");
		System.out.println("On paste value = "+onPasteVal);
		
		driver.quit();
	}
}