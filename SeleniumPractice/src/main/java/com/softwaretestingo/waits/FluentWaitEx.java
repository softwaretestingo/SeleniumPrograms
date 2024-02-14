package com.softwaretestingo.waits;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentWaitEx 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.softwaretestingo.com/buttons/");

		By BtnClickMe = By.id("dkDwt");

		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage(".....Element Not Found.....");

		WebElement ClickMeButton= wait.until(ExpectedConditions.presenceOfElementLocated(BtnClickMe));
		ClickMeButton.click();

		By msgText=By.xpath("(//p)[4]");
		wait.until(ExpectedConditions.presenceOfElementLocated(msgText));

		String msg=driver.findElement(msgText).getText(); System.out.println(msg);

		driver.quit();
	}
}