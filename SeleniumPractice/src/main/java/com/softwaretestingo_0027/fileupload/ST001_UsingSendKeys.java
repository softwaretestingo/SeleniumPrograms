package com.softwaretestingo_0027.fileupload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST001_UsingSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String projectDirectory = System.getProperty("user.dir");
		String fileFolder="\\Resources\\sampletxt.txt";
		System.out.println("Project Directory: " + projectDirectory);
		String fullpath=projectDirectory+fileFolder;
		System.out.println(fullpath);
		System.out.println("C:\\Users\\10745824\\git\\sepgms\\SeleniumPrograms\\SeleniumPractice\\Resources\\sampletxt.txt");
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys(fullpath);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);
		//driver.quit();
	}
}