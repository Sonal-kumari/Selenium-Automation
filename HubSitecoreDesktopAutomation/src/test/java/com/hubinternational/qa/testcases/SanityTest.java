package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.CharMatcher;
import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Agribusiness;
import com.hubinternational.qa.pages.Careers;
import com.hubinternational.qa.pages.CommercialProperty;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Industries;
import com.hubinternational.qa.pages.Insights;
import com.hubinternational.qa.pages.Offices;
import com.hubinternational.qa.pages.Products;
import com.hubinternational.qa.pages.SearchBar;
import com.hubinternational.qa.util.TestUtil;

public class SanityTest extends TestBase{

	Home home;
	Industries industries;
	Agribusiness agribusiness;
	Products products;
	CommercialProperty cp;
	Insights insights;
	Offices offices;
	Careers careers;
	SearchBar sb;
	
	public SanityTest()
	{
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		initialization();
		home = new Home();
		industries = new Industries();
		agribusiness = new Agribusiness();
		products = new Products();
		cp = new CommercialProperty();
		insights = new Insights();
		offices = new Offices();
		careers = new Careers();
		sb = new SearchBar();
	}
	
	@Test(priority = 0)
	public void hubLogoTest()
	{
		String url = home.validateLogo();
		Assert.assertEquals(url, "https://www.hubinternational.com/");
	}
	
	@Test(priority = 1)
	public void agribusinessPageTest()
	{
		
		home.industriesLinkClick();
		industries.agribusinessLinkClick();
		boolean flag = agribusiness.validateAgribusinessPageComponent();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 2)
	public void commercialPropertyPageTest()
	{
		home.productsLinkClick();
		products.businessInsuranceTabLink();
		products.commercialPropertyLink();
		boolean flag = cp.validateCommercialPropertyPage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void insightsPageTest()
	{
		home.insightsLinkClick();
		boolean flag = insights.validatePageComponent();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 4)
	public void officesPageTest()
	{
		home.officesLinkClick();
		boolean flag = offices.verifyOfficePageComponent();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 5)
	public void searchPageTest()
	{
		home.searchIconClick();
		String text = sb.pageAction();
		text = CharMatcher.is('\"').trimFrom(text);
		Assert.assertEquals(text, TestUtil.inputValue);
	}
	
	@Test(priority = 6)
	public void careersPageTest()
	{
		home.careersLinkClick();
		boolean flag = careers.verifyPageComponent();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
