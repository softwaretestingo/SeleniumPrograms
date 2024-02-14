package com.softwaretestingo.testng.interfaceex;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class InterfaceImplementationClass implements InterfaceWithTestMethods {
	@Test
	public void DriverClassMethod() 
	{
		System.out.println("Driver class method");
	}

	@Override
	@BeforeTest
	public void beforeTestMethod() {

	}

	@Override
	@Test
	public void testMethod() {

	}

	@Override
	@AfterTest
	public void afterTestMethod() {

	}
}