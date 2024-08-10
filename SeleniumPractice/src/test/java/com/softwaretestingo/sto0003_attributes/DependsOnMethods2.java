package com.softwaretestingo.sto0003_attributes;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class DependsOnMethods2 
{
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Browser Launched.");
	}

	@Test
	public void loadFacebookURL()
	{
		System.out.println("Facebook URL loaded.");
	}

	/*
	 * registerOnFacebook depends on loadFacebookURL
	 */
	@Test(dependsOnMethods = {"loadFacebookURL"})
	public void registerOnFacebook()
	{
		System.out.println("Register on Facebook.");
	}

	/*
	 * postStatusOnFacebook depends on registerOnFacebook
	 */
	@Test(dependsOnMethods = {"registerOnFacebook"})
	public void postStatusOnFacebook()
	{
		System.out.println("Post a status on Facebook.");
	}
}