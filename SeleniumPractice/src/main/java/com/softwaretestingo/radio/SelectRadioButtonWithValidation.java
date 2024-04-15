package com.softwaretestingo.radio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelectRadioButtonWithValidation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/radio/");
		Thread.sleep(2000);
		
		WebElement radioBtn=driver.findElement(By.xpath("//label[@for='yesRadio']"));
		radioBtn.click();
		Thread.sleep(2000);
		WebElement msg=driver.findElement(By.xpath("//span[@class='text-success']"));
		if(msg.getText().equalsIgnoreCase("Yes"))
		{
			System.out.println("Sucess Message Displayed");
		}
		else
		{
			System.out.println("Sucess Message Not Displayed");
		}
		driver.quit();
	}
}