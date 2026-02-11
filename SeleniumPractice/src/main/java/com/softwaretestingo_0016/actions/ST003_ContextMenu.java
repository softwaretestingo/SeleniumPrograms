package com.softwaretestingo_0016.actions;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ST003_ContextMenu 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(element).build().perform();
		
		List<WebElement> allElement=driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
		for(WebElement el:allElement)
		{
			String dropdown_value=el.getText();
			System.out.println(dropdown_value);
			if(dropdown_value.equals("Copy"))
			{
				el.click();
				Thread.sleep(2000);
				Alert alert=driver.switchTo().alert();
				Thread.sleep(2000);
				String alertText=alert.getText();
				System.out.println(alertText);
				alert.accept();
				break;
			}
		}
		driver.quit();
	}
}