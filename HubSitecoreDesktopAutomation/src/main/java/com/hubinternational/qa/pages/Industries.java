package com.hubinternational.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hubinternational.qa.base.TestBase;

public class Industries extends TestBase{
	
	@FindBy(xpath = "//a[@aria_label=\"secondary Agribusiness\"]")
	WebElement agribusinessLink;
	
	public Industries()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Agribusiness agribusinessLinkClick()
	{
		agribusinessLink.click();
		return new Agribusiness();
	}
	
}
