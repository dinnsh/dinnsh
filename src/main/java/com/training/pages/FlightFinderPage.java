package com.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.Base.BaseTest;

public class FlightFinderPage extends BaseTest{
	
	public FlightFinderPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@value='oneway']")
	WebElement oneWayRadio;
	
	public void selectFlightDetails()
	{
		oneWayRadio.click();
	}

}
