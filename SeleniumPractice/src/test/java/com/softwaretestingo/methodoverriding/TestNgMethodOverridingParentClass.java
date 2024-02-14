package com.softwaretestingo.methodoverriding;
import org.testng.annotations.Test;
public class TestNgMethodOverridingParentClass 
{
	@Test
	public void superTestNgMethod()
	{
		System.out.println("Super testng method");
	}

	@Test
	public void superTestNgAnotherMethod()
	{
		System.out.println("Super testng Another method");
	}
}