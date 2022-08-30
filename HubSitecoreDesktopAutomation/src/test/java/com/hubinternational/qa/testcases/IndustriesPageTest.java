package com.hubinternational.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Industries;

public class IndustriesPageTest extends TestBase{
	
	Industries industries;
	Home home;
	
	public IndustriesPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		industries = new Industries();
		home = new Home();
		home.industriesLinkClick();
	}
	@Test
	public void agribusinessLinkTest()
	{
		industries.agribusinessLinkClick();
	}
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
}
