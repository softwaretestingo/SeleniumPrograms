package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.Test;
public class DefaultExecutionOrder {
	@Test
	public void printMethod() 
	{
		System.out.println("Print method");
	}

	@Test
	public void showMethod() 
	{
		System.out.println("Show method");
	}

	@Test
	public void amroodMethod() 
	{
		System.out.println("Amrrod method");
	}
}