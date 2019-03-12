package com.training.Utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

import com.training.Base.BaseTest;


public class ExcelUtility {
	
	ExcelReader excelReader;
	
	@DataProvider(name = "ExcelDP")
	public Object[][] getData(Method m)
	{
		excelReader = new ExcelReader((System.getProperty("user.dir")+ "/src/test/resources/TestData/TestData.xlsx"));
		String sheetName = m.getName();
		System.out.println(sheetName);
		int row = excelReader.getRowCount(sheetName);
		int column = excelReader.getColumnCount(sheetName);
		
		Object[][] data = new Object[row-1][column];
		
		for(int rowCount = 2;rowCount<=row;rowCount++)
		{
			for(int colCount = 0;colCount<column;colCount++)
			{
				data[rowCount-2][colCount] = excelReader.getCellData(sheetName, colCount, rowCount);
			}
	    }			
		return data;
	}
	
	public static void captureScreenshot() {

		File scrFile = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		try{
		FileHandler.copy(scrFile,
				new File(System.getProperty("user.dir") + "\\test-output\\" + screenshotName));
		}
		catch(IOException e)
		{
			
		}
	}


}
