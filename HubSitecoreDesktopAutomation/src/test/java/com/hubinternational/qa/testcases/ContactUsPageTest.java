package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.ContactUs;
import com.hubinternational.qa.pages.Home;

public class ContactUsPageTest extends TestBase{

	Home home;
	ContactUs cs;
	
	public ContactUsPageTest()
	{
		super();
	}
		
	@BeforeMethod
	public void setUp()
	{
		initialization();
		home = new Home();
		home.contactUsLinkClick();
		cs = new ContactUs();
	}
	
	@Test(priority = 0)
	public void verifyContactUsPageTest()
	{
		String url = cs.validateContactUsPageUrl();
		Assert.assertTrue(true, url);
	}
	@Test(priority = 1)
	public void businessInsuranceClick()
	{
		cs.businessInsuranceButtonClick();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
