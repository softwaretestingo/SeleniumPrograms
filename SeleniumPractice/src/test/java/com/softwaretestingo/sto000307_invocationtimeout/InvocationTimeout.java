package com.softwaretestingo.sto000307_invocationtimeout;
import org.testng.annotations.Test;
public class InvocationTimeout 
{
	/**
	 * If the Execution Is Not Completed With The Mentioned Time Then
	 * You will get ThreadTimeoutException
	 */
	@Test(invocationCount = 7, invocationTimeOut = 9000)
	public void testMethod() throws InterruptedException
	{
		System.out.println("Test Method Executed");
		Thread.sleep(1000);
	}
}