package com.softwaretestingo.testng.attributes;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AlwaysRunAttributeEx2 
{
	@Test
	public void method1()
	{
		System.out.println("Method 1");
		// Failing test explicitly
		Assert.fail();
	}

	@Test
	public void method2()
	{
		System.out.println("Method 2");
	}
}