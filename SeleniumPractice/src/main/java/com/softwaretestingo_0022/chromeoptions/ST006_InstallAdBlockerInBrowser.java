package com.softwaretestingo_0022.chromeoptions;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
public class ST006_InstallAdBlockerInBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addExtensions(new File("C:\\Users\\Freelancer\\git\\seleniumprograms\\SeleniumPractice\\Resources\\adblock.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}