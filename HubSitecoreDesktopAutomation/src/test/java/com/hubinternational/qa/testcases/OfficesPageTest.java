package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Offices;

public class OfficesPageTest extends TestBase{

	Offices offices;
	Home home;
	public OfficesPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		offices = new Offices();
		home = new Home();
		home.officesLinkClick();
	}
	@Test(priority = 0)
	public void verifyOfficePageUrlTest()
	{
		String url = offices.verifyOfficePageUrl();
		Assert.assertEquals(url, "https://www.hubinternational.com/offices/");
	}
	@Test(priority = 1)
	public void verifyOfficePageComponentTest()
	{
		boolean flag = offices.verifyOfficePageComponent();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
