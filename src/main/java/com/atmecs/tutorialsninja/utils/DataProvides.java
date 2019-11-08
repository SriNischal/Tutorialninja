package com.atmecs.tutorialsninja.utils;

import org.testng.annotations.DataProvider;

public class DataProvides {

	@DataProvider(name = "destination")
	public Object[][] gethomepagedata() {
		TestDataProvider provideData = new TestDataProvider(ProjectBaseConstantPaths.XLSX_FILE, 0);
		Object[][] getData = provideData.provideData();
		return getData;
	}

	@DataProvider(name = "heroimage")
	public Object[][] getheroingdata() {
		TestDataProvider provideData = new TestDataProvider(ProjectBaseConstantPaths.XLSX_FILE, 1);
		Object[][] getData = provideData.provideData();
		return getData;
	}
}
