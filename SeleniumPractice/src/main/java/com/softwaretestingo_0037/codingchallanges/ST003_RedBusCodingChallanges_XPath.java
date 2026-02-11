package com.softwaretestingo_0037.codingchallanges;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST003_RedBusCodingChallanges_XPath 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        driver.findElement(By.xpath("//span[@class='dateText']/../../i")).click();
        dateSelect("May 2024");
	}
	public static void dateSelect(String date) 
	{
        boolean desiredMonth = true;
        while (desiredMonth) 
        {
            String text = driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__IconBlock')])[2]")).getText();
            if (text.contains(date)) 
            {
                desiredMonth = false;
            }
            else
            {
                driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__IconBlock')])[3]")).click();
            }
        }
        String holidayCount = driver.findElement(By.xpath("//div[@class='holiday_count']")).getText();
        System.out.println(holidayCount);
        List<WebElement> elements = driver.findElements(By.xpath("//span[contains(@class,'DayTiles__CalendarDaysSpan')]"));
        for (WebElement el : elements) 
        {
            if (el.getCssValue("color").equalsIgnoreCase("rgba(216, 78, 85, 1)")) 
            {
                System.out.println(el.getText());
            }
        }
    }
}