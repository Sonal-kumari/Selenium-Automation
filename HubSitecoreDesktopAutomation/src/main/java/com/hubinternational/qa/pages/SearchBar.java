package com.hubinternational.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hubinternational.qa.base.TestBase;
import com.hubinternational.qa.util.TestUtil;

public class SearchBar extends TestBase
{
	public SearchBar()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "search-bar")
	WebElement inputBox;
	
	@FindBy(className = "search-sb")
	WebElement searchIcon;
	
	@FindBy(className = "query-text")
	WebElement queryText;
	
	public String pageAction()
	{
		inputBox.sendKeys(TestUtil.inputValue);
		searchIcon.click();
		TestUtil.wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		TestUtil.wait.until(ExpectedConditions.visibilityOf(queryText));
		String text = queryText.getText();
		return text;
	}
}
