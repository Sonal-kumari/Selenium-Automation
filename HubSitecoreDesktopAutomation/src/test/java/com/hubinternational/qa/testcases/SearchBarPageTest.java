package com.hubinternational.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.CharMatcher;
import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.pages.Home;
import com.hubinternational.qa.pages.SearchBar;
import com.hubinternational.qa.util.TestUtil;

public class SearchBarPageTest extends TestBase{

	Home home;
	SearchBar sb;
	
	public SearchBarPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		home = new Home();
		home.searchIconClick();
		sb = new SearchBar();
	}
	
	@Test
	public void searchPageTest()
	{
		String text = sb.pageAction();
		System.out.println(text);
		text = CharMatcher.is('\"').trimFrom(text);
		Assert.assertEquals(text, TestUtil.inputValue);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
