package com.softwaretestingo.locator.cssselector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CSSWithAttributeNot 
{
	//When Multiple Elements Match That Time We Can Exclude Some Elements
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/text-box/");
		Thread.sleep(3000);
		String lblText= driver.findElement(By.cssSelector("div#userName-wrapper>div:not(div[class='col-md-9 col-sm-12'])>label")).getText();
		System.out.println("The Label Text: "+lblText);
		driver.close();
	}
}