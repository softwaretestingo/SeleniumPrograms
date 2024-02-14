package com.softwaretestingo.testng.interfaceex;
import org.testng.annotations.Test;
public interface InterfaceWithTestMethodBody 
{
	@Test
	public static void staticMethod() 
	{
		System.out.println("Static method");
	}
	@Test
	public default void DefaultMethod() 
	{
		System.out.println("Default Method");
	}
}