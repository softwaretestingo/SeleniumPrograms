package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.Test;
public class InvocationCount 
{

	@Test(invocationCount = 5)
	public void testMethod() throws InterruptedException
	{
		System.out.println("Test Method Executed");
		Thread.sleep(3000);
	}
}
