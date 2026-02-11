package com.softwaretestingo_0002.webdrivercommands;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ST020_PageLoadTimeout 
{
	// This will Hold the Execution for the mentioned Time Period
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		System.out.println("Cookies Deleted");
		// The Below Use of pageLoadTimeout() is Depreciated
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//Now You Can Use like Below
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.quit();
	}
}