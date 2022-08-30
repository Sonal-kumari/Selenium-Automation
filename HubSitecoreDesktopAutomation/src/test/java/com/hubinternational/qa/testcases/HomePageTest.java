package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Home;

public class HomePageTest extends TestBase{

	Home home;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		home = new Home();
	}
	
	@Test(priority = 0)
	public void hubLogoTest()
	{
		String url = home.validateLogo();
		Assert.assertEquals(url, "https://www.hubinternational.com/");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
