package com.hubinternational.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubinternational.qa.base.TestBase;

public class Home extends TestBase {
	
	@FindBy(className="logo")
	WebElement hubLogo;
	
	@FindBy(xpath = "//a[@data-link-text=\"industries\"][@href=\"#\"]")
	WebElement industriesLink;
	
	@FindBy(xpath = "//a[@data-link-text=\"products\"][@href=\"#\"]")
	WebElement productsLink;
	
	@FindBy(xpath = "//a[@data-link-text=\"insights\"]")
	WebElement insightsLink;
	
	@FindBy(xpath = "//a[@data-link-text=\"offices\"][@aria-label=\"Main navigation Offices\"]")
	WebElement officesLink;
	
	@FindBy(xpath = "//a[@data-link-text=\"careers\"][@aria-label=\"Main navigation Careers\"]")
	WebElement careersLink;
	
	@FindBy(xpath = "//a[@data-link-text=\"contact us\"][@aria-label=\"Main navigation Contact Us\"]")
	WebElement contactUsLink;
	
	@FindBy(className = "search-icon")
	WebElement searchIcon;
	
	@FindBy(xpath = "//a[@data-link-text=\"compliance bulletins\"]")
	WebElement complianeBulletins;
	
	public Home()
	{
		PageFactory.initElements(driver, this);
	}
	
	@SuppressWarnings("deprecation")
	public String validateLogo()
	{
		hubLogo.click();
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS );
        String url = driver.getCurrentUrl();
		return url;
	}
	
	public Industries industriesLinkClick()
	{
		industriesLink.click();
		return new Industries();
	}
	
	public Products productsLinkClick()
	{
		productsLink.click();
		return new Products();
	}
	
	public void insightsLinkClick()
	{
		insightsLink.click();
	}
	
	public void officesLinkClick()
	{
		officesLink.click();	
	}
	
	public void careersLinkClick()
	{
		careersLink.click();
	}
	
	public void contactUsLinkClick()
	{
		contactUsLink.click();
	}
	
	public void searchIconClick()
	{
		searchIcon.click();
	}
	
	public void complianceBulletinsClck()
	{
		complianeBulletins.click();
	}
}
