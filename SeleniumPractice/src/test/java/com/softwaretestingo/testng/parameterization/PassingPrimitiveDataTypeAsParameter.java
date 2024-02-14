package com.softwaretestingo.testng.parameterization;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class PassingPrimitiveDataTypeAsParameter 
{
	@Test
	@Parameters({"testParameters1","testParameters2"})
	// I used Optional annotation with parameter declaration
	public void testMethod(@Optional String testParameters1, @Optional int testParameters2)
	{
		System.out.println("Paramters one for test method: "+testParameters1);
		System.out.println("Paramters two for test method: "+testParameters2);
	}
}