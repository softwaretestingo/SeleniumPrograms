package com.softwaretestingo.sto0003003_priority;
import org.testng.annotations.Test;
public class PriorityChildClass extends PrioritySuperClass
{
	@Test
	public void PrintMethod() 
	{
		System.out.println("Subclass: Capital P method");
	}

	@Test
	public void printMethod()
	{
		System.out.println("Subclass: Small P method");
	}

	@Test
	public void _Method() 
	{
		System.out.println("Subclass: Underscore method");
	}

	@Test
	public void $Method() 
	{
		System.out.println("Subclass: Dollar method");
	}
}