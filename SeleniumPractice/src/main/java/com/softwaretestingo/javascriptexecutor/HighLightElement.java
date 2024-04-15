package com.softwaretestingo.javascriptexecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HighLightElement 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/login/");
		Thread.sleep(2000);
		
		WebElement userName=driver.findElement(By.name("uname"));
		HighLightElement obj=new HighLightElement();
		obj.flash(userName);
		userName.sendKeys("SoftwareTestingO");
		
		driver.close();
	}
	public void flash(WebElement element)
	{
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++)
		{
			changeColor("rgb(0,200,0)", element);
			changeColor(bgcolor,element);
		}
	}

	private void changeColor(String bgcolor, WebElement element) 
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+bgcolor+"'", element);
		
		try 
		{
			Thread.sleep(20);
		}
		catch (InterruptedException e) 
		{
			
		}
	}
}