package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.ContactUs;
import com.hubinternational.qa.pages.ContactUsBusinessInsurance;
import com.hubinternational.qa.pages.Home;

public class ContactUsBusinessInsuranceTest extends TestBase{
	
	Home home;
	ContactUs cs;
	ContactUsBusinessInsurance cubi;
	
	public ContactUsBusinessInsuranceTest()
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
		cs.businessInsuranceButtonClick();
	}
	
	@Test
	public void ContactUsBusinessInsurancePageComponentTest()
	{
		boolean flag = cubi.verifyFirstNameField();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
