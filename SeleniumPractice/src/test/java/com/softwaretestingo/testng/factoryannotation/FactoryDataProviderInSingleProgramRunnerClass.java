package com.softwaretestingo.testng.factoryannotation;
import org.testng.annotations.Factory;
public class FactoryDataProviderInSingleProgramRunnerClass 
{
	@Factory 
	public Object[] factorymethod() 
	{ 
		return new Object[]{new FactoryDataProviderInSingleProgram(), new FactoryDataProviderInSingleProgram()}; 
	}
}