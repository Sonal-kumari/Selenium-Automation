package com.hubinternational.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubinternational.qa.base.TestBase;

public class Products extends TestBase{
	
	@FindBy(xpath = "//a[@data-link-text=\"business insurance\"]")
	WebElement businessInsuranceTabLink;
	
	@FindBy(xpath = "//a[@data-link-text=\"commercial property\"]")
	WebElement commercialPropertyPageLink;
	
	public Products()
	{
		PageFactory.initElements(driver, this);
	}

	public void businessInsuranceTabLink()
	{
		businessInsuranceTabLink.click();
	}
	
	public void commercialPropertyLink()
	{
		commercialPropertyPageLink.click();
	}
	
}
