package com.softwaretestingo.moreresources;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class DisableImagesInFirefox 
{
	private static ChromeOptions chromeOptions;
	private static EdgeOptions edgeOptions;
	private static FirefoxOptions firefoxOptions;
	public static void main(String[] args) throws InterruptedException 
	{
		// # 1 – Allow all images # 2 – Block all images # 3 – Block 3rd party images
		disableImagesInFirefox();
		Thread.sleep(5000);
		disableImagesInEdgeMethodOne();
		Thread.sleep(5000);
		disableImagesInEdgeMethodTwo();
		Thread.sleep(5000);
		disableImagesInChromeMethodOne();
		Thread.sleep(5000);
		disableImagesInChromeMethodTwo();
	}
	// CHROME METHOD 1
	private static void disableImagesInChromeMethodOne() throws InterruptedException 
	{
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--blink-settings=imagesEnabled=false");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/");
		Thread.sleep(5000);
		driver.quit();
	}
	
	// CHROME METHOD 2
	private static void disableImagesInChromeMethodTwo() throws InterruptedException 
	{
		chromeOptions = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		chromeOptions.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/");
		Thread.sleep(5000);
		driver.quit();
	}

	// EDGE METHOD 1
	private static void disableImagesInEdgeMethodOne() throws InterruptedException 
	{
		edgeOptions = new EdgeOptions();
		edgeOptions.addArguments("--blink-settings=imagesEnabled=false");
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/");
		Thread.sleep(5000);
		driver.quit();	
	}

	// EDGE METHOD 2
	public static void disableImagesInEdgeMethodTwo() throws InterruptedException 
	{
		edgeOptions = new EdgeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		edgeOptions.setExperimentalOption("prefs", prefs);
		WebDriver driver = new EdgeDriver(edgeOptions);
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/");
		Thread.sleep(5000);
		driver.quit();
	}

	// FIREFOX
	private static void disableImagesInFirefox() throws InterruptedException 
	{
		firefoxOptions = new FirefoxOptions();
		firefoxOptions.addPreference("permissions.default.image", 2);
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		driver.manage().window().maximize();
		driver.get("https://opencart.softwaretestingo.com/");
		Thread.sleep(5000);
		driver.quit();	
	}
}