package com.softwaretestingo.testng.innerclass;
import org.testng.annotations.Test;
public class ClassWithInnerClass 
{
	@Test
	public void outerMethod()
	{
		System.out.println("Outer");
	}
	class InnerClass
	{
		@Test
		public void innerMethod()
		{
			System.out.println("Inner");
		}
	}
}