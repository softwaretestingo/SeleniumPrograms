package com.softwaretestingo.testng.listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.softwaretestingo.testng.listeners.ListenerImplementedClass.class)
public class TestNGListenersTest 
{
	@Test //Passing Test
	public void sampleTest1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opencart.softwaretestingo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[4]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	@Test //Failing Test
	public void sampleTest2() throws InterruptedException
	{
		System.out.println("Forcely Failed Test Method");
		Assert.assertTrue(false);
	}
	private int i = 0;
	//Test Failing But Within Success Percentage
	@Test(successPercentage = 60, invocationCount = 5) 
	public void sampleTest3() 
	{
		i++;
		System.out.println("Test Failed But Within Success Percentage Test Method, invocation count: " + i);
		if (i == 1 || i == 2)
		{
			System.out.println("sampleTest3 Failed");
			Assert.assertEquals(i, 6);
		}
	}
	//Skipping Test
	@Test 
	public void sampleTest4()
	{
		throw new SkipException("Forcely skipping the sampleTest4");
	}
}