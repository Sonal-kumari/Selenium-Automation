package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Careers;
import com.hubinternational.qa.pages.Home;

public class CareersPageTest extends TestBase{

	Home home;
	Careers careers;
	
	public CareersPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		home = new Home();
		home.careersLinkClick();
		careers = new Careers();
	}
	
	@Test
	public void verifypPageTest()
	{
		boolean flag = careers.verifyPageComponent();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
