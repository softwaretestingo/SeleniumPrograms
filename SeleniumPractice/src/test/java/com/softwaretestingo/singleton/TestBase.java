package com.softwaretestingo.singleton;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TestBase 
{
	public static WebDriver driver=null;
	   public static void initilize()
	   {
	      //Use Of Singleton Concept and Initilize webDriver
	      if(driver == null)
	      {
	         if(ConstantVariable.browserName.equalsIgnoreCase("chrome"))
	         {
	            driver=new ChromeDriver();
	         }
	         else if(ConstantVariable.browserName.equalsIgnoreCase("Firefox"))
	         {
	            driver=new FirefoxDriver();
	         }
	         else if(ConstantVariable.browserName.equalsIgnoreCase("IE"))
	         {
	            driver=new EdgeDriver();
	         }
	      }
	      
	      //Perform Basic Operations
	      driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   }
	   public static void quit()
	   {
	      driver.quit();
	      driver=null; // we destroy the driver object after quit operation
	   }
	   public static void close()
	   {
	      driver.quit();
	      driver=null;  // we destroy the driver object after quit operation
	   }   
	   public  static void openurl(String URL)
	   {
	      driver.get(URL);
	   }
}