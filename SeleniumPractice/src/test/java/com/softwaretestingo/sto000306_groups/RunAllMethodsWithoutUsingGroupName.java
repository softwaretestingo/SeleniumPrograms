package com.softwaretestingo.sto000306_groups;
import org.testng.annotations.Test;
public class RunAllMethodsWithoutUsingGroupName 
{
	// A test method belongs to Group G1
	@Test(groups = { "G1" })
	public void G1Method1() 
	{
		System.out.println("G1 Method1");
	}

	// A test method belongs to Group G1
	@Test(groups = {"G1"})
	public void G1Method2() 
	{
		System.out.println("G1 Method2");
	}

	// A test method belongs to Group G2
	@Test(groups = {"G2"})
	public void G2Method1() 
	{
		System.out.println("G2 Method1");
	}

	// A test method belongs to Group G2
	@Test(groups = {"G2"})
	public void G2Method2() 
	{
		System.out.println("G2 Method2");
	}

	// A test method belongs to Group G3
	@Test(groups = {"G3"})
	public void G3Method1() 
	{
		System.out.println("G3 Method1");
	}

	// A test method belongs to Group G3
	@Test(groups = {"G3"})
	public void G3Method2() 
	{
		System.out.println("G3 Method2");
	}
}