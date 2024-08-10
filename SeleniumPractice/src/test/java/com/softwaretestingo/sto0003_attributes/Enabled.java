package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.Test;
public class Enabled 
{
	@Test
	public void method1()
	{
		System.out.println("Method 1 Executed");
	}
	@Test(enabled = true)
	public void method2()
	{
		System.out.println("Method 2 Executed");
	}
	@Test(enabled = false)
	public void method3()
	{
		System.out.println("Method 3 Executed");
	}
}