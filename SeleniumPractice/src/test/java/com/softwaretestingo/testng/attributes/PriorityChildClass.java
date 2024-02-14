package com.softwaretestingo.testng.attributes;
import org.testng.annotations.Test;
public class PriorityChildClass extends PrioritySuperClass
{
	@Test
	public void PrintMethod() 
	{
		System.out.println("Capital P method");
	}

	@Test
	public void printMethod()
	{
		System.out.println("Small P method");
	}

	@Test
	public void _Method() 
	{
		System.out.println("Underscore method");
	}

	@Test
	public void $Method() 
	{
		System.out.println("Dollar method");
	}
}