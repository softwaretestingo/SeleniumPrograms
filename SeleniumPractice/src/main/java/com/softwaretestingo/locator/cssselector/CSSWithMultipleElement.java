package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSWithMultipleElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		// This Will Select Cancel & Submit Button But Print Last Button Text Which is Cancel
		String btnText=driver.findElement(By.cssSelector("button.cancelbtn, button#submitbtn")).getText();
		System.out.println("The Button Text: "+btnText);
		Thread.sleep(3000);
		driver.close();
	}
}