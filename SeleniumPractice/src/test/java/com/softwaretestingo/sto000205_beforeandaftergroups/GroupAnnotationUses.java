package com.softwaretestingo.sto000205_beforeandaftergroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
public class GroupAnnotationUses 
{
	@BeforeGroups("Test1")
	public void login()
	{
		System.out.println("Login Sucessfully");
	}
	@AfterGroups("Test2")
	public void logout()
	{
		System.out.println("Logout Sucessfully");
	}
	@Test(groups={"Test1"})
	public void FundTransfer()
	{
		System.out.println("Fund Transfer");
	}
	@Test(groups={"Test1","Test2"})
	public void search()
	{
		System.out.println("Search Sucessfully");
	}
	@Test(groups={"Test2"})
	public void bill()
	{
		System.out.println("Bill Generated");
	}
}
