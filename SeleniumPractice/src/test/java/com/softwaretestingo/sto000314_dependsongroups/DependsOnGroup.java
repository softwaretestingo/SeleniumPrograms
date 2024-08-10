package com.softwaretestingo.sto000314_dependsongroups;
import org.testng.annotations.Test;
public class DependsOnGroup 
{
	// Test method belong to preSetupTestA
	@Test(groups= {"preSetupTestA"})
	public void methodA()
	{
		System.out.println("MethodA");
	}

	//Test method belong to preSetupTestA
	@Test(groups= {"preSetupTestA"})
	public void methodB()
	{
		System.out.println("MethodB");
	}

	// Test method belong to preSetupTestB
	@Test(groups= {"preSetupTestB"})
	public void methodC()
	{
		System.out.println("MethodC");
	}

	// Test method belong to preSetupTestB
	@Test(groups= {"preSetupTestB"})
	public void methodD()
	{
		System.out.println("MethodD");
	}

	// Test method which is dependent of other groups
	@Test(dependsOnGroups = {"preSetupTestB", "preSetupTestA"})
	public void finalTest()
	{
		System.out.println("Final Test.");
	}
}