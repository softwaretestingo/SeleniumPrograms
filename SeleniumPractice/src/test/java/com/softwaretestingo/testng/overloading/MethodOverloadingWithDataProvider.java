package com.softwaretestingo.testng.overloading;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class MethodOverloadingWithDataProvider 
{
	// Data provider which provides one attribute
	@Test(dataProvider="DemoData1")
	public void NormalMethod(String s)
	{
		System.out.println("Normal Method");
	}

	// Data provider which provides two attribute
	@Test(dataProvider="DemoData")
	public void NormalMethod(String s,int a)
	{
		System.out.println("Overloaded Method");
	}

	@DataProvider(name="DemoData")
	public static Object[][] dataProviderMethod()
	{
		return new Object[][] {{"SoftwareTestingo",2023}};
	}

	@DataProvider(name="DemoData1")
	public static Object[][] dataProviderMethod1()
	{
		return new Object[][] {{"SoftwareTestingo"}};
	}
}
