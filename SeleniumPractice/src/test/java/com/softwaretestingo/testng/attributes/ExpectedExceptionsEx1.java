package com.softwaretestingo.testng.attributes;
import org.testng.annotations.Test;
public class ExpectedExceptionsEx1 
{
	@Test(expectedExceptions = {ArithmeticException.class})
	public void testException() 
	{
		System.out.println("www.softwaretestingo.com");

		int arr[] = null; // array is assigned a null value
		System.out.println("The length of the array arr is: " + arr.length);
	}
}