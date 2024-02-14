package com.softwaretestingo.testng.interfaceex;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public interface InterfaceWithTestMethods 
{
	@BeforeTest
	public void beforeTestMethod();

	@Test
	public void testMethod();

	@BeforeTest
	public void afterTestMethod();
}
