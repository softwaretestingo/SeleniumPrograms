package com.softwaretestingo.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class SendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/index.php?route=account/register");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		By firstName=By.id("input-firstname"); 
		By lastName=By.id("input-lastname");
		By btnContinue=By.xpath("//[@class='btn btn-primary']");

		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(firstName), "SoftwareTestingO").build().perform();
		act.sendKeys(driver.findElement(lastName), "Blog").build().perform();
		act.click(driver.findElement(btnContinue)).build().perform();
	}
}