package com.softwaretestingo.sto000304_dependsonmethods;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SoftDependeny 
{
	// Explicitly failing method on which Test2 is dependent
	@Test
	public void Test1()
	{
		System.out.println("I am Test1");
		Assert.fail();
	}

	// Test2 will run if Test1 has failed. Because we have used alwaysRun attribute.
	@Test(dependsOnMethods= {"Test1"}, alwaysRun= true)
	public void Test2()
	{
		System.out.println("I am Test2");
	}
}
