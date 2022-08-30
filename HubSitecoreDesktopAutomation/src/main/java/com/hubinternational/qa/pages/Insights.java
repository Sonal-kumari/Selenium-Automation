package com.hubinternational.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.util.TestUtil;

public class Insights extends TestBase{
	
	public Insights()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class=\"insights-label\"][text()=\"Trending\"]")
	WebElement trendingClick;
	
	public String validateInsightsPageTitle()
	{
		TestUtil.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		TestUtil.wait.until(ExpectedConditions.urlToBe("https://www.hubinternational.com/insights/"));
		String title = driver.getTitle();
		return title;
	}
	public boolean validatePageComponent()
	{
		boolean flag = trendingClick.isDisplayed();
		return flag;
	}
}
