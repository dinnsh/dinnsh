package com.training.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.Base.BaseTest;

public class RegisterPage extends BaseTest{
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstName;
	
	public void enterFirstName(String strFirstName)
	{
		firstName.sendKeys(strFirstName);
	}

}
