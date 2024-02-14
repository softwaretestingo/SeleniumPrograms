package com.softwaretestingo.svg;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleSVGElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		String SVGPath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		List<WebElement> stateList=driver.findElements(By.xpath(SVGPath));
		System.out.println("Total Number Of States: "+stateList.size());
		
		
		for(WebElement state:stateList)
		{
			String stateName = state.getAttribute("name");
			System.out.println(stateName);
		}
		
		driver.close();
	}
}