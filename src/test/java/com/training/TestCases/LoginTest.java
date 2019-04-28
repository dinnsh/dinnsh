package com.training.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.Utilities.ExcelUtility;
import com.training.pages.LoginPage;
import com.training.pages.RegisterPage;

public class LoginTest extends BaseTest{
	
	LoginPage loginPage;
	RegisterPage registerPage;
	
	public LoginTest() {
		super();
	}
	
	@Test(dataProviderClass=com.training.Utilities.ExcelUtility.class, dataProvider = "ExcelDP",groups={"sanity"})
	public void Login(String UserName, String Password)
	{
		loginPage = new LoginPage();
		System.out.println(UserName+"  "+Password);
		loginPage.enterUserName(UserName);
		ExcelUtility.captureScreenshot();
		registerPage = loginPage.clickRegister();
		registerPage.enterFirstName(UserName);
		ExcelUtility.captureScreenshot();
	}
}
