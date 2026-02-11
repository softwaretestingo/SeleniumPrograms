package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_XPathContainsWithText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/submit-click.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[contains(text(),'First name:')]/following-sibling::input)[1]")).sendKeys("SoftwareTestingo Blog");
		Thread.sleep(3000);
		driver.quit();
	}
}