package com.softwaretestingo.testng.factoryannotation;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
class SimpleTestForParameters
{
	private int param;
	public SimpleTestForParameters (int param)
	{
		this.param=param;
	}

	@Test
	public void simpleTest1() 
	{
		System.out.println("Simple Test Method1 : " + param);
	}

	@Test
	public void simpleTest2() 
	{
		System.out.println("Simple Test Method2 : " + param);
	}

	@Test
	public void simpleTest3() 
	{
		System.out.println("Simple Test Method3 : " + param);
	}

	@Test
	public void simpleTest4() 
	{
		System.out.println("Simple Test Method4 : " + param);
	}

	@Test
	public void simpleTest5() 
	{
		System.out.println("Simple Test Method5 : " + param);
	}
}

public class SimpleFactoryRunnerClassWithParameters 
{
	@Factory
	public Object[] factoryMethod() 
	{
		Object[] data = new Object[5];
		data[0] = new SimpleTestForParameters(10);
		data[1] = new SimpleTestForParameters(20);
		data[2] = new SimpleTestForParameters(30);
		data[3] = new SimpleTestForParameters(40);
		data[4] = new SimpleTestForParameters(50);
		return data;
	}
}