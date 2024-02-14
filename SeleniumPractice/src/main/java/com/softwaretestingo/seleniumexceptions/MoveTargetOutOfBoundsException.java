package com.softwaretestingo.seleniumexceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveTargetOutOfBoundsException 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/register");
		Thread.sleep(3000);

		//MoveTargetOutOfBoundsException - When Element is Not Present With In the Window 
		By btnContinue=By.xpath("//button[@type='submit']");
		Actions act=new Actions(driver);
		act.click(driver.findElement(btnContinue)).perform();
	}
}