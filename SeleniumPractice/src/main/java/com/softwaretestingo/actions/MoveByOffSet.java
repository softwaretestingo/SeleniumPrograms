package com.softwaretestingo.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class MoveByOffSet 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signature-generator.com/draw-signature/");
		Thread.sleep(3000);
		
		WebElement canva=driver.findElement(By.id("signature-pad"));
		
		Actions act=new Actions(driver);
		
		Action signature = act.click(canva)
			.moveToElement(canva, 5, 5)
			.clickAndHold(canva)
			.moveToElement(canva, -200, -50)
			.moveByOffset(50, -50)
			.moveByOffset(50, -50)
			.moveByOffset(20, -50)
			.moveByOffset(151, 155).release(canva).build();
		signature.perform();
		Thread.sleep(3000);
		driver.close();
	}
}