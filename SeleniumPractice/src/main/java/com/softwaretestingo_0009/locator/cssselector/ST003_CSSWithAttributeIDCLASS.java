package com.softwaretestingo_0009.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_CSSWithAttributeIDCLASS 
{
	/**
	 * Finding An Element with CSS Selector Using Both ID & Class Details
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/css-selector-adv-example.html");
		Thread.sleep(3000);
		/*There should be no spaces between two attributes*/
		driver.findElement(By.cssSelector("#username.form-control")).sendKeys("SoftwareTestingO");
		driver.findElement(By.cssSelector("#password.form-control")).sendKeys("Blog");
		Thread.sleep(3000);
		driver.quit();
	}
}