package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.Test;
public class IgnoreMissingDependencies2 
{
	@Test(enabled= false)
	public void Test1()
	{
		System.out.println("I am Test1");
	}

	/*
	 * This test method depends on another test method named "Test1" which is not enabled.
	 */
	@Test(dependsOnMethods= {"Test1"})
	public void Test2()
	{
		System.out.println("I am Test2");
	}
}