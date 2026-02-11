package com.softwaretestingo_0011.dropdown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST008_HandleBootStrapDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://primeng.org/dropdown";
		WebElement dropDown;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.findElement(By.xpath("//span[contains(text(),'Ok, Got it')]")).click();
		dropDown = driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[1]"));
		dropDown.click();
		Thread.sleep(3000);
		List<WebElement> values=driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));
		for(WebElement value:values)
		{
			System.out.println(value.getText());
		}
		driver.quit();
	}
}