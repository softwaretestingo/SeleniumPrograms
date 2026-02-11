package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_XPathContains 
{
	/**
	 * Locating an Element using contains() function with this you can pass
	 * partially id name like suppose id is fname then you can pass fna[this will also work ]
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@id,'fna')]")).sendKeys("SoftwareTestingo Blog");
		Thread.sleep(3000);
		driver.quit();
	}
}