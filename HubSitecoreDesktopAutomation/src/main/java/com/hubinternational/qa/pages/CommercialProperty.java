package com.hubinternational.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubinternational.qa.base.TestBase;

public class CommercialProperty extends TestBase{

	public CommercialProperty()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()=\"Commercial Property Insurance\"]")
	WebElement validateHeadlineText;
	
	public boolean validateCommercialPropertyPage()
	{
		return validateHeadlineText.isDisplayed();
	}
	
}
