package com.softwaretestingo.testng.listeners;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ReporterListenerTest 
{
	@Test
	public void firstMethod() 
	{
		Assert.assertTrue(true);
	}

	@Test
	public void secondMethod() 
	{
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = {"firstMethod"})
	public void thirdMethod() 
	{
		Assert.assertTrue(true);
	}
}