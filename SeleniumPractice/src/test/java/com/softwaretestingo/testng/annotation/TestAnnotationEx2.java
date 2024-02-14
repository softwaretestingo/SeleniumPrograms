package com.softwaretestingo.testng.annotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@Test
public class TestAnnotationEx2 
{
	@BeforeClass
	public void m1()
	{
		System.out.println("M1");
	}

	public void m2()
	{
		System.out.println("M2");
	}

	public void m3()
	{
		System.out.println("M3");
	}

	@AfterClass
	public void m4()
	{
		System.out.println("M4");
	}
}