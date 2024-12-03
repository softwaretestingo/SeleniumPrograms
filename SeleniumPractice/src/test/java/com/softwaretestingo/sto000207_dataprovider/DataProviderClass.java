package com.softwaretestingo.sto000207_dataprovider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderClass 
{
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("Before class executed");
	}

	@DataProvider
	public Object[][] message()
	{
		return new Object [][]
		{
			{"Manas", new Integer (123)}, 
			{"Manoj", new Integer (456)}
		};
	}

	@Test (dataProvider="message")
	public void PrintMsg(String name, Integer id)
	{
		System.out.println("Names are: "+name+" " +id);
	}
}