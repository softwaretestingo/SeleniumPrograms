package com.softwaretestingo.sto0003003_priority;
import org.testng.annotations.Test;
public class PriorityAttributeExample 
{
	// We can pass priority as negative value.
	@Test(priority = -1)
	public void NegativePrioirty() 
	{
		System.out.println("Negative Prioirty");
	}

	// We can pass priority as default value zero.
	@Test(priority = 0)
	public void ZerothPriority() 
	{
		System.out.println("Zeroth Priority");
	}

	@Test(priority = 1)
	public void PositivePriority() 
	{
		System.out.println("Positive Priority");
	}
	// When you Not Define any Priority
	@Test()
	public void SkippedPriority() 
	{
		System.out.println("Skipped Priority");
	}
	// It is not mandatory to pass priority in a order
	@Test(priority=34)
	public void RandomPriority() 
	{
		System.out.println("Random Priority");
	}
}