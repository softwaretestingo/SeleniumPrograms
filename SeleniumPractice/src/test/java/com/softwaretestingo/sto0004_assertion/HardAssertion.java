package com.softwaretestingo.sto0004_assertion;
import org.testng.Assert;
import org.testng.annotations.Test;
public class HardAssertion 
{
	String className = "HardAssertion";
	@Test
	public void test_UsingHardAssertion() 
	{
		Assert.assertTrue(true == true);
		Assert.assertEquals("HardAssert", "HardAssertion");
		Assert.assertEquals(className, "HardAssertion");
		System.out.println("Successfully passed!");
	}
}