package com.softwaretestingo.testng.attributes;
import org.testng.annotations.Test;
public class Description 
{
	@Test (description = "Test Attributes Method")
	public void method()
	{
		System.out.println("Method Executed");
	}
}
