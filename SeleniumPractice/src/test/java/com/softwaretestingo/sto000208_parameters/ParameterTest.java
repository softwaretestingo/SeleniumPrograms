package com.softwaretestingo.sto000208_parameters;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParameterTest 
{
	@Test
	@Parameters({"testParameters1","testParameters2"})
	public void testMethod(String testParameters1, String testParameters2)
	{
		System.out.println("Paramters one for test method: "+testParameters1);
		System.out.println("Paramters two for test method: "+testParameters2);
	}
}