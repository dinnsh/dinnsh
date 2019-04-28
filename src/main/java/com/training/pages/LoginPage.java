package com.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.Base.BaseTest;
import com.training.Utilities.ExcelUtility;
import com.training.pages.RegisterPage;

public class LoginPage extends BaseTest{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name='userName']")
	WebElement userName;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement registerLink;
	
	@FindBy(xpath="//a[text()='Flights']")
	WebElement flightsLink;
	
	public void enterUserName(String strUserName){
		userName.sendKeys(strUserName);
	}
	
	public RegisterPage clickRegister()
	{
		registerLink.click();
		return new RegisterPage();
	}
	
	public void clickFlightLink()
	{
		flightsLink.click();
	}

}
