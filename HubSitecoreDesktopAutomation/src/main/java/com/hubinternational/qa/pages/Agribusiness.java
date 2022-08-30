package com.hubinternational.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.util.TestUtil;

public class Agribusiness extends TestBase{
	
	public Agribusiness()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"Cannabis Insurance\"]")
	WebElement agribusinessComponent;
	
	public boolean validateAgribusinessPageComponent()
	{
		TestUtil.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		TestUtil.wait.until(ExpectedConditions.visibilityOf(agribusinessComponent));
		return agribusinessComponent.isDisplayed();
	}
}
