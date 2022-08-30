package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Agribusiness;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.Industries;

public class AgribusinessPageTest extends TestBase{

	Agribusiness agribusiness;
	Industries industries;
	Home home;
	
	public AgribusinessPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		industries = new Industries();
		home = new Home();
		agribusiness = new Agribusiness();
		home.industriesLinkClick();
		industries.agribusinessLinkClick();
	}
	@Test
	public void agribusinessPageTest()
	{
		boolean flag = agribusiness.validateAgribusinessPageComponent();
		Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
