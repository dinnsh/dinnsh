package com.training.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.Utilities.ExcelUtility;
import com.training.pages.FlightFinderPage;
import com.training.pages.LoginPage;
import com.training.pages.SelectFlightPage;

public class BookFlight extends BaseTest{
	
	public BookFlight() {
		super();
	}
	
	
	
	@Test(dataProviderClass=com.training.Utilities.ExcelUtility.class, dataProvider = "ExcelDP",groups={"sanity,Regression"})
	public void BookFlight(String FName, String LName, String CreditCarNumber)
	{
		LoginPage loginPage = new LoginPage();
		loginPage.clickFlightLink();
		FlightFinderPage flightfinderPage = new FlightFinderPage();
		flightfinderPage.selectFlightDetails();
		SelectFlightPage selectFlightPage = new SelectFlightPage();
		
	}
	
	
}
