package com.softwaretestingo.sto000205_beforeandaftergroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
public class DependsOnGroups 
{
	@BeforeGroups("smoke")
	public void setUp() 
	{
		System.out.println("Browser Launched");
	}

	@AfterGroups("smoke")
	public void tearDown() 
	{
		System.out.println("Browser Closed");
	}

	@Test(groups = "smoke")
	public void HomePage() 
	{
		System.out.println("Home Page Launched");
		throw new RuntimeException();
	}

	@Test(dependsOnGroups = {"smoke"})
	public void verifyTest() 
	{
		System.out.println("Smoke Test Completed");
	}
}