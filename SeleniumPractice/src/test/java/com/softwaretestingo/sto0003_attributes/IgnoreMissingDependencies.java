package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.Test;
public class IgnoreMissingDependencies 
{
	/*
	 * This test method depends on another test method named "Test1" which does not exist.
	 */
	@Test(dependsOnMethods= {"Test1"})
	public void Test2()
	{
		System.out.println("I am Test2");
	}
}