package com.softwaretestingo.testng.attributes;
import org.testng.annotations.Test;
public class AlwaysRunAttributeEx1 
{
	@Test
	public void method1()
	{
		System.out.println("Method 1");
	}

	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}
}