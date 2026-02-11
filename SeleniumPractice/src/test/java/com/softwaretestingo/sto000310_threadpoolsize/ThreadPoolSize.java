package com.softwaretestingo.sto000310_threadpoolsize;
import org.testng.annotations.Test;
public class ThreadPoolSize 
{
	@SuppressWarnings("deprecation")
	@Test(invocationCount = 5,threadPoolSize=5)
	public void testMethod() throws InterruptedException
	{
		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
	}
}