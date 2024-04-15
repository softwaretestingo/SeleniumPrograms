package com.softwaretestingo.scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
public class ScrollToElementSwitchToFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.softwaretestingo.com/wp-content/uploads/2023/11/frame_with_nested_scrolling_frame_out_of_view.html");
		Thread.sleep(2000);

		WebElement iframe = driver.findElement(By.tagName("iframe"));
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(iframe);
		new Actions(driver)
		.scrollFromOrigin(scrollOrigin, 0, 200)
		.perform();

		driver.switchTo().frame(iframe);
		WebElement checkbox = driver.findElement(By.name("scroll_checkbox"));
		Thread.sleep(3000);
		checkbox.click();

		Thread.sleep(3000);
		driver.close();
	}
}