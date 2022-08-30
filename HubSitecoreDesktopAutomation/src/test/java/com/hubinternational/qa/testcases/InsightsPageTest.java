package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Insights;

public class InsightsPageTest extends TestBase{

	Home home;
	Insights insights;
	public InsightsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		home = new Home();
		insights = new Insights();
		home.insightsLinkClick();
	}
	@Test(priority = 0)
	public void validateInsightsPageTitleTest()
	{
		String title = insights.validateInsightsPageTitle();
		Assert.assertEquals(title, "Insights | HUB International");
	}
	@Test(priority = 1)
	public void validateInsightsPageComponentTest()
	{
		boolean flag = insights.validatePageComponent();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
