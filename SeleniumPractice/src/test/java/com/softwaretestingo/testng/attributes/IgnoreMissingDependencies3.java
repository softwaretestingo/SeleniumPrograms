package com.softwaretestingo.testng.attributes;
import org.testng.annotations.Test;
public class IgnoreMissingDependencies3 
{
	@Test(enabled= false)
	public void Test1()
	{
		System.out.println("I am Test1");
	}

	/*
	 * This test method depends on another test method named "Test1" which is not enabled.
	 */
	@Test(dependsOnMethods= {"Test1"}, ignoreMissingDependencies= true)
	public void Test2()
	{
		System.out.println("I am Test2");
	}
}