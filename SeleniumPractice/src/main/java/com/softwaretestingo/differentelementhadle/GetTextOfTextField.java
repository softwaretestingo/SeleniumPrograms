package com.softwaretestingo.differentelementhadle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTextOfTextField 
{
	//GetText Will Not Work With the TextBox, It Will Only Work For Those element Where the Value is Already Available Inside the DOM
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/register");
		Thread.sleep(2000);
		
		WebElement first_name=driver.findElement(By.id("input-firstname"));
		first_name.sendKeys("SoftwareTestingo");
				
		// GetThe Value Of Text Box
		String enteredValue= first_name.getAttribute("value");
		System.out.println("The Entered Value Is: "+enteredValue);
		driver.close();
	}
}