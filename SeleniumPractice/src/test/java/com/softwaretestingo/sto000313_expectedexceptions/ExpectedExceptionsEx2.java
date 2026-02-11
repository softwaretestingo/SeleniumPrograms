package com.softwaretestingo.sto000313_expectedexceptions;
import org.testng.annotations.Test;
public class ExpectedExceptionsEx2 
{
	@SuppressWarnings("unused")
	@Test(expectedExceptions = {NullPointerException.class})
	public void testException() 
	{
		System.out.println("www.softwaretestingo.com");

		int i = 1 / 0;
	}
}