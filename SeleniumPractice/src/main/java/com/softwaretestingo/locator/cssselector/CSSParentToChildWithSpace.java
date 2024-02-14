package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSParentToChildWithSpace 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(3000);
		String lbluname=driver.findElement(By.cssSelector("label[for='uname'] b")).getText();
		String lblpwd=driver.findElement(By.cssSelector("label[for='psw']>b")).getText();
		System.out.println("Label Text For UserName: "+lbluname);
		System.out.println("Label Text For Password: "+lblpwd);
		driver.close();
	}
}