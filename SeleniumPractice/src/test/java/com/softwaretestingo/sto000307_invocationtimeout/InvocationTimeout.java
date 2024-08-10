package com.softwaretestingo.sto000307_invocationtimeout;
import org.testng.annotations.Test;
public class InvocationTimeout 
{
	@Test(invocationCount = 7, invocationTimeOut = 6000)
	public void testMethod() throws InterruptedException
	{
		System.out.println("Test Method Executed");
		Thread.sleep(1000);
	}
}