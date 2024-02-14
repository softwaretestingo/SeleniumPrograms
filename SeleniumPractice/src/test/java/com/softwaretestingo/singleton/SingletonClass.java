package com.softwaretestingo.singleton;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SingletonClass 
{

	@BeforeMethod
	public void setup()
	{
		TestBase.initilize();
	}
	@Test
	public void openUrl() throws InterruptedException
	{
		TestBase.openurl(ConstantVariable.URl);
		Thread.sleep(3000);
	}
	@AfterMethod
	public void tearDown()
	{
		TestBase.quit();
	}
}
