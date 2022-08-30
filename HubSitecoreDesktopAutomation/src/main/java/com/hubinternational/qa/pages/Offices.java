package com.hubinternational.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.util.TestUtil;

public class Offices extends TestBase{

	public Offices()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[aria-label=\"Search by city or address\"]")
	WebElement inputBox1;
	
	public String verifyOfficePageUrl()
	{
		TestUtil.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		TestUtil.wait.until(ExpectedConditions.urlToBe("https://www.hubinternational.com/offices/"));
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public boolean verifyOfficePageComponent()
	{
		return inputBox1.isDisplayed();
	}
}
