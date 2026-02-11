package com.softwaretestingo.sto000101_testngmethodoverriding;
import org.testng.annotations.Test;
public class ST001_TestNgMethodOverridingChildClass extends TestNgMethodOverridingParentClass
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