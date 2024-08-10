package com.softwaretestingo.sto000304_dependsonmethods;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOnMethods 
{
	@Test
	public void method1()
	{
		System.out.println("Method 1 Executed");
	}
	@Test(dependsOnMethods = "method1")
	public void method2()
	{
		System.out.println("Method 2 Executed");
	}
	@Test
	public void method3()
	{
		//Intentionally We Fail This Method
		Assert.fail();
		System.out.println("Method 3 Executed");
	}
	@Test (dependsOnMethods = {"method1","method3"})
	public void method4()
	{
		System.out.println("Method 4 Executed");
	}
}