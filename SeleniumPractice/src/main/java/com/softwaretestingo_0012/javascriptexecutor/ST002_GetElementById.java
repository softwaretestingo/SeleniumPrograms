package com.softwaretestingo_0012.javascriptexecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_GetElementById 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=product/product&language=en-gb&path=34&product_id=32");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//document.getElementById('input-quantity').value='2'
		js.executeScript("document.getElementById('input-quantity').value='2'");
		Thread.sleep(3000);
		driver.quit();
	}
}