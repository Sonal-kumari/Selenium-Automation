package com.hubinternational.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Products;

public class ProductsPageTest extends TestBase{
	
	Products products;
	Home home;
	
	public ProductsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		products = new Products();
		home = new Home();
		home.productsLinkClick();
	}
	@Test
	public void businessLinkClickTest()
	{
		products.businessInsuranceTabLink();
	}
	@Test
	public void commercialPropertyLinkTest()
	{
		products.commercialPropertyLink();
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
