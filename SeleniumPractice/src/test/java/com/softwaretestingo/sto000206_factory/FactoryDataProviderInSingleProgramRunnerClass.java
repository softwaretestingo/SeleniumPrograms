package com.softwaretestingo.sto000206_factory;
import org.testng.annotations.Factory;
public class FactoryDataProviderInSingleProgramRunnerClass 
{
	@Factory 
	public Object[] factorymethod() 
	{ 
		return new Object[]{new FactoryDataProviderInSingleProgram(), new FactoryDataProviderInSingleProgram()}; 
	}
}