package com.softwaretestingo_0018.waits;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ST009_ExplicitWait_presenceOfAllElementsLocatedBy 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		
		By elements=By.xpath("//h5[contains(text(),'Elements')]/following-sibling::*/a");
		WebDriverWait waits=new WebDriverWait(driver, Duration.ofSeconds(20));
		List<WebElement> AllElements = waits.until(ExpectedConditions.presenceOfAllElementsLocatedBy(elements));
		
		System.out.println("Size Of the Elements: "+AllElements.size());
		for(int i=0;i<AllElements.size();i++)
		{
			System.out.println(AllElements.get(i).getText());
		}
		driver.quit();
	}
}