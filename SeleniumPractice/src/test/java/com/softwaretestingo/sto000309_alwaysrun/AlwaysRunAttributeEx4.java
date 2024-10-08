package com.softwaretestingo.sto000309_alwaysrun;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AlwaysRunAttributeEx4 
{
	@Test
	public void method1() 
	{
		System.out.println("Method 1");
		// Failing test explicitly
		Assert.fail();
	}

	@Test(dependsOnMethods = "method1", alwaysRun = true)
	public void method2() 
	{
		System.out.println("Method 2");
	}

	@Test(dependsOnMethods = "method2", alwaysRun = true)
	public void method3() 
	{
		System.out.println("Method 3");
	}
}