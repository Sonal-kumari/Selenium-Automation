package com.hubinternational.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubinternational.qa.base.TestBase;

public class ContactUsBusinessInsurance extends TestBase{

	public ContactUsBusinessInsurance()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "CrmItem_FirstNameField")
	WebElement firstName;
	
	public boolean verifyFirstNameField()
	{
		boolean flag = firstName.isDisplayed();
		return flag;
	}
	
}
