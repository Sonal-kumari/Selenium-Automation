package com.hubinternational.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubinternational.qa.base.TestBase;

public class Careers extends TestBase{

	public Careers()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	WebElement locationField;
	
	public boolean verifyPageComponent()
	{
		driver.navigate().to("https://hubinternational.jobs/");
		boolean flag = locationField.isDisplayed();
		return flag;
	}
}
