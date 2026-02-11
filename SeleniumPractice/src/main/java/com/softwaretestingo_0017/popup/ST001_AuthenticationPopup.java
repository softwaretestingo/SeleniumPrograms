package com.softwaretestingo_0017.popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_AuthenticationPopup 
{
	static String userName="admin";
	static String passWord="admin";
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://"+userName+":"+passWord+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//Validate The Text
		String msgSucess=driver.findElement(By.cssSelector("div.example>p")).getText();
		System.out.println("The msg is: "+msgSucess);
		Thread.sleep(3000);
		driver.quit();
	}
}