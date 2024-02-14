package com.softwaretestingo.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/dropable/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//nav[@role='tablist']/a)[2]")).click();
		
		WebElement srcElement=driver.findElement(By.id("acceptable"));
		WebElement destiElement=driver.findElement(By.xpath("(//div[@id='droppable'])[2]"));
		
		System.out.println(srcElement.getText());
		System.out.println(destiElement.getText());
		
		Actions act=new Actions(driver);
		act.dragAndDrop(srcElement, destiElement).build().perform();
		Thread.sleep(3000);
		
		driver.close();
	}
}