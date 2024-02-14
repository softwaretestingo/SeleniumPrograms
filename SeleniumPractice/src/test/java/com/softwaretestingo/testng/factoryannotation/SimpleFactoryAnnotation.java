package com.softwaretestingo.testng.factoryannotation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
class SimpleTestClass
{
	private String param = " ";

	public SimpleTestClass(String param) 
	{
		this.param = param;
	}

	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before SimpleTestClass class executed");
	}

	@Test
	public void testMethod()
	{
		System.out.println("testMethod parameter value is: " + param);
	}
}
public class SimpleFactoryAnnotation 
{
	@Factory
	public Object[] factoryMethod() 
	{
		return new Object[] 
				{
						new SimpleTestClass("one"),
						new SimpleTestClass("two")
				};
	}
}