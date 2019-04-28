package com.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.Base.BaseTest;

public class SelectFlightPage extends BaseTest{
	
	public SelectFlightPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@value='oneway']")
	WebElement oneWayRadio;
	
	public void selectFlightDetails()
	{
		oneWayRadio.click();
	}

}
