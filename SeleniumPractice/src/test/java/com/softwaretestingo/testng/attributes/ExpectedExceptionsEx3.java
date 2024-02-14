package com.softwaretestingo.testng.attributes;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
public class ExpectedExceptionsEx3 
{
	@Test(expectedExceptions = {NullPointerException.class,NoSuchElementException.class,ArithmeticException.class})
	public void testException() 
	{
		System.out.println("www.softwaretestingo.com");

		int i = 1 / 0;
	}
}