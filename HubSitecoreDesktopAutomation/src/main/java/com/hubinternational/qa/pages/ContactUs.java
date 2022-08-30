package com.hubinternational.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.util.TestUtil;

public class ContactUs extends TestBase{

	@FindBy(xpath="//div/a[text()=\"Business Insurance\"]")
	WebElement businessInsuranceButton;
	
	public ContactUs()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateContactUsPageUrl()
	{
		TestUtil.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		TestUtil.wait.until(ExpectedConditions.urlToBe("https://www.hubinternational.com/contact-us"));
		String url = driver.getCurrentUrl();
		return url;
	}
	public void businessInsuranceButtonClick()
	{
		businessInsuranceButton.click();
	}
}
