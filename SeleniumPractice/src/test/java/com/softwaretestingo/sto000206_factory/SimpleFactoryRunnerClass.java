package com.softwaretestingo.sto000206_factory;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
class SimpleTest
{
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

public class SimpleFactoryRunnerClass 
{
	@Factory
	public Object[] factoryMethod() 
	{
		Object[] data = new Object[5];
		data[0] = new SimpleTest();
		data[1] = new SimpleTest();
		data[2] = new SimpleTest();
		data[3] = new SimpleTest();
		data[4] = new SimpleTest();
		return data;
	}
}