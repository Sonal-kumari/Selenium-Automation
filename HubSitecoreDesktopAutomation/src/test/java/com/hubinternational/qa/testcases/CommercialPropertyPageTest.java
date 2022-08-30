package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.CommercialProperty;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Products;

public class CommercialPropertyPageTest extends TestBase{

	Home home;
	Products products;
	CommercialProperty cp;
	
	public CommercialPropertyPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		home = new Home();
		products = new Products();
		cp = new CommercialProperty();
		home.productsLinkClick();
		products.businessInsuranceTabLink();
		products.commercialPropertyLink();
	}
	@Test
	public void commercialPropertyPageTest()
	{
		boolean flag = cp.validateCommercialPropertyPage();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
