package com.softwaretestingo.testng.overloading;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MethodOverloadingWithParameter 
{
	@Parameters({ "name" })
	@Test
	public void NormalMethod(String name) 
	{
		System.out.println("Normal Method");
	}

	@Parameters({ "name1", "age" })
	@Test
	public void NormalMethod(String name, int age) 
	{
		System.out.println("Overloaded Method");
	}
}