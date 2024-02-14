package com.softwaretestingo.testng;
import org.testng.annotations.Test;
public class SubTestNGClass extends SuperTestNgClass
{
	@Test
	public void subTestNgMethod()
	{
		System.out.println("Sub testng method");
	}
}