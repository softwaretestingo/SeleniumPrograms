package com.softwaretestingo.differentelementhadle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/slider/");
		Thread.sleep(2000);
		
		By slider=By.id("slider");
		driver.findElement(slider).click();
		
		int width=driver.findElement(slider).getSize().getWidth();
		System.out.println("Width Of The Slider: "+width);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(slider),-((width/2)-30),0).click().build().perform();
		act.clickAndHold(driver.findElement(slider)).moveByOffset(-((width/2)-300),0).click().build().perform();
		Thread.sleep(3000);
		driver.close();
	}
}