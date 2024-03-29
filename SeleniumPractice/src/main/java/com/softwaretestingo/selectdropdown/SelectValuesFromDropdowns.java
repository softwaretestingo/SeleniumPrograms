package com.softwaretestingo.selectdropdown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelectValuesFromDropdowns 
{
	/* @Author - SoftwareTestingo
	 * 
	 * Problem Statement
	 * 
	 * 1. Open the URL
	 * 2. Click on The Dropdown
	 * 3. Print All The Heading and Values
	 * 4. Print All The Values
	 * 5. Close the Browser
	 * */
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
		WebElement dropDown;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		dropDown=driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
		dropDown.click();
		Thread.sleep(3000);		
		
		//Print All Values (Heading + Values)
		List<WebElement> values=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		for(WebElement value:values)
		{
			System.out.println(value.getText());
		}
		System.out.println("--------------------------");
		
		//Print OnlyValues
		List<WebElement> onlyValues=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li[not(@class='multiselect-item multiselect-group')]//label"));
		for(WebElement eachValue:onlyValues)
		{
			System.out.println(eachValue.getText());
		}
		
		//Select JQuery and BootStrap and Unselect HTML&CSS
		List<WebElement> All=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li[not(@class='multiselect-item multiselect-group')]//label"));
		WebElement chkbox=driver.findElement(By.tagName("input"));
		for(WebElement eachV:All)
		{
			String optionText=eachV.getText();
			WebElement optionChkBox=eachV.findElement(By.tagName("input"));
			if(optionText.contains("jQuery"))
			{
				if(optionChkBox.isSelected())
					continue;
				else
					optionChkBox.click();
					
			}
			
			if(optionText.contains("Bootstrap"))
			{
				if(optionChkBox.isSelected())
					continue;
				else
					optionChkBox.click();
					
			}	
			if(optionText.contains("HTML") && optionChkBox.isSelected())
			{
				System.out.println(chkbox.isSelected());
				if(optionChkBox.isSelected())
					optionChkBox.click();
					Thread.sleep(2000);
					
			}
			if(optionText.contains("CSS") && optionChkBox.isSelected())
			{
				System.out.println(optionChkBox.isSelected());
				if(optionChkBox.isSelected())
					optionChkBox.click();
					Thread.sleep(2000);
					
			}
		}
		driver.quit();
	}
}