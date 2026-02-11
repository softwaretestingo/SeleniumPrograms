package com.softwaretestingo_0023.edgebrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
public class ST001_DisablePersonalisePrompt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// This will Open the browser with Guest Profile
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("-guest");
				
		WebDriver driver=new EdgeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}