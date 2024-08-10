package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.Test;
public class ThreadPoolSize 
{
	@Test(invocationCount = 5,threadPoolSize=5)
	public void testMethod() throws InterruptedException
	{
		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
	}
}