package com.training.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.Utilities.ExcelUtility;

public class SubmitOrderTest extends BaseTest{
	
	public SubmitOrderTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		browserSetUp();
	}
	
	@Test(dataProviderClass=com.training.Utilities.ExcelUtility.class, dataProvider = "ExcelDP",groups={"sanity,Regression"})
	public void SubmitOrder(String Product, String Quantity)
	{
		System.out.println(Product+"  "+Quantity);
	}
	
	@AfterMethod
	public void TarDown()
	{
		driver.quit();
	}
}
