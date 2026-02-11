package com.softwaretestingo_0027.fileupload;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ST002_UsingRobotClass 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		String projectDirectory = System.getProperty("user.dir");
		String filePath="\\Resources\\SoftwareTestingO.png";
		String fullPath=projectDirectory+filePath;
		System.out.println(fullPath);
		System.out.println("C:\\Users\\10745824\\git\\sepgms\\SeleniumPrograms\\SeleniumPractice\\Resources\\SoftwareTestingO.png");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(3000);
			
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		driver.switchTo().activeElement();
		
		StringSelection ss=new StringSelection(fullPath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.quit();
	}
}