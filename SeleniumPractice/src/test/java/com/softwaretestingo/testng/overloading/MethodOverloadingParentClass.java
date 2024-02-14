package com.softwaretestingo.testng.overloading;
import org.testng.annotations.Test;
public class MethodOverloadingParentClass 
{
	@Test
	public void NormalMethod()
	{
		System.out.println("Normal Method");
	}

	// Overloaded Method
	@Test
	public void NormalMethod(String name)
	{
		System.out.println("Overloaded Method");
	}
}