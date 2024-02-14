package com.softwaretestingo.methodoverriding;
import org.testng.annotations.Test;
public class TestNgMethodOverridingChildClass extends TestNgMethodOverridingParentClass
{
	// Overriding super class testng methods
	@Test
	public void superTestNgMethod() 
	{
		System.out.println("Super testng method overrriden in sub class");
	}

	// Method of sub class
	@Test
	public void subTestNgMethod() 
	{
		System.out.println("Sub testng method");
	}
}