package com.softwaretestingo.testng.factoryannotation;
import org.testng.annotations.Test;
public class SimpleClassWithMultipleMethods {
	@Test
	public void simpleTest1() 
	{
		System.out.println("Simple Test Method1.");
	}

	@Test
	public void simpleTest2() 
	{
		System.out.println("Simple Test Method2.");
	}

	@Test
	public void simpleTest3() 
	{
		System.out.println("Simple Test Method3.");
	}

	@Test
	public void simpleTest4() 
	{
		System.out.println("Simple Test Method4.");
	}

	@Test
	public void simpleTest5() 
	{
		System.out.println("Simple Test Method5.");
	}
}