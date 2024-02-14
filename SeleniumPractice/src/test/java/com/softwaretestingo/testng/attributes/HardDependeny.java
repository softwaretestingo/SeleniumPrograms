package com.softwaretestingo.testng.attributes;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HardDependeny 
{
	// Explicitly failing method on which Test2 is dependent
	@Test
	public void Test1()
	{
		System.out.println("I am Test1");
		Assert.fail();
	}

	// Test2 will not run as Test1 has failed. Test2 will be marked as skipped.
	@Test(dependsOnMethods= {"Test1"})
	public void Test2()
	{
		System.out.println("I am Test2");
	}
}
