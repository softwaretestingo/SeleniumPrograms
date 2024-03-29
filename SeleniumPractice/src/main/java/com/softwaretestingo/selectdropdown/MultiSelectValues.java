package com.softwaretestingo.selectdropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelectValues 
{
	static String URL="https://demo.softwaretestingo.com/multi-select-values/";
	static WebElement dropdown;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.className("spTextField"));
		
		Select select=new Select(dropdown);
		
		// Check Multiple Select Is Allowed Or Not
		System.out.println("Multiple Selection is Allowed: "+select.isMultiple());
		
		select.selectByVisibleText("Performance Testing");
		select.selectByIndex(1);
		
		
		//Get First Selected Element
		WebElement firstElement= select.getFirstSelectedOption();
		System.out.println(firstElement.getText());
		
		//Deselect The First Element
		select.deselectAll();
		Thread.sleep(3000);
		driver.quit();
	}
}