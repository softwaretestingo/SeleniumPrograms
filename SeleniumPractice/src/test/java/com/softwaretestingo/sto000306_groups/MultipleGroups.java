package com.softwaretestingo.sto000306_groups;
import org.testng.annotations.Test;
public class MultipleGroups 
{
	// A test method belongs to Group G1 and G2
	@Test(groups = { "G1", "G2" })
	public void MethodsBelongToG1G2() 
	{
		System.out.println("MethodsBelongToG1G2");
	}

	// A test method belongs to Group G1, G2 and G3
	@Test(groups = { "G1", "G2", "G3" })
	public void MethodsBelongToG1G2G3() 
	{
		System.out.println("MethodsBelongToG1G2G3");
	}

	// A test method belongs to Group G1
	@Test(groups = { "G1" })
	public void MethodsBelongToG1() 
	{
		System.out.println("MethodsBelongToG1");
	}

	// A test method belongs to Group G2
	@Test(groups = { "G2" })
	public void MethodsBelongToG2() 
	{
		System.out.println("MethodsBelongToG2");
	}

	// A test method belongs to Group G3
	@Test(groups = { "G3" })
	public void MethodsBelongToG3() 
	{
		System.out.println("MethodsBelongToG3");
	}

	// A test method belongs to Group G1 and G3
	@Test(groups = { "G1", "G3" })
	public void MethodsBelongToG1G3() 
	{
		System.out.println("MethodsBelongToG1G3");
	}
}