package com.softwaretestingo.testng.factoryannotation;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FactoryDataProviderInSingleProgram 
{
	@DataProvider
	public Object[][] message()
	{
		return new Object [][]{	{"Manas" , new Integer (2023)},	{"Manoj", new Integer (2022)}};
	}
	@Test (dataProvider="message")
	public void PrintMsg(String name, Integer id)
	{
		System.out.println("Names are: "+name+" "+id);
	}

	@Test public void PrintSuccessfullMessage() 
	{
		System.out.println("Print the successful message"); 
	}
}