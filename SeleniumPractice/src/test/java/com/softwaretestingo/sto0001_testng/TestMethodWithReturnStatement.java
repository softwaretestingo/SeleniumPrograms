package com.softwaretestingo.sto0001_testng;
import org.testng.annotations.Test;
public class TestMethodWithReturnStatement 
{
	// A @Test method which is returning a value will be ignored by TestNG
	@Test
	public String returnMethod()
	{
		System.out.println("Returning Method");
		return "SoftwareTestingo";
	}
	@Test
	public void normalMethod()
	{
		System.out.println("Normal Method");
	}
}