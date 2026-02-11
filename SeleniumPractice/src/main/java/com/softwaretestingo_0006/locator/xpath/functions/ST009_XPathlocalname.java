package com.softwaretestingo_0006.locator.xpath.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST009_XPathlocalname 
{
	/**
	 * This Function Will Help you to locate all the elements with the tag name
	 * Syntax: //*[local-name()='TagName']
	 * If you Found Multiple Element then You can use the Position method to find the unique element
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://softwaretestingo.blogspot.com/2020/08/class-name-locator.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[local-name()=\"input\"])[position()=3]")).sendKeys("SoftwareTestingo");
		Thread.sleep(3000);
		driver.quit();
	}
}