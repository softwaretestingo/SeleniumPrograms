package com.softwaretestingo.testng.parameterization;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class PassingValuesUsingOptionalParames 
{
	@Test
	@Parameters({ "testParameters1", "testParameters2" })
	/*
	 * If "testParameters1" not found in testng xml use value provided for parameter
	 * "optionalParames". If none is present in testng xml, use null.
	 */
	public void testMethod(@Optional("optionalParames") String testParameters1,
			@Optional("optionalParames") String testParameters2) 
	{
		System.out.println("Paramters one for test method: " + testParameters1);
		System.out.println("Paramters two for test method: " + testParameters2);
	}
}