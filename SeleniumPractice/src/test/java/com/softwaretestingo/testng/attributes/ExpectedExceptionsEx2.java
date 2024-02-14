package com.softwaretestingo.testng.attributes;
import org.testng.annotations.Test;
public class ExpectedExceptionsEx2 
{
	@Test(expectedExceptions = {NullPointerException.class})
	public void testException() 
	{
		System.out.println("www.softwaretestingo.com");

		int i = 1 / 0;
	}
}