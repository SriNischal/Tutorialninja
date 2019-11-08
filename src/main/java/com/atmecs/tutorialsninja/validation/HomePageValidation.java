package com.atmecs.tutorialsninja.validation;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.tutorialninja.Testsuite.TutorialninjaPageactions;
import com.atmecs.tutorialsninja.utils.ProjectBaseConstantPaths;
import com.atmecs.tutorialsninja.utils.ReadLocatorsFile;

public class HomePageValidation {
	TutorialninjaPageactions page;
	ReadLocatorsFile read;
	@SuppressWarnings("static-access")
	public void titleValidate(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualtitle;
        String expectedtitle;
		actualtitle=page.getText(read.getData("validate.text.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
		expectedtitle=page.getText(read.getData("expectedtitle", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Successfully validated " + expectedtitle);
		System.out.println(actualtitle);
		System.out.println(expectedtitle);
	}	
	@SuppressWarnings("static-access")
	public void avilabilityValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String expectedavilability;
        String actualavilability;
		actualavilability=page.getText(read.getData("validate.iphoneavilability.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
		expectedavilability=page.getText(read.getData("iphoneexpectedavilability", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualavilability, expectedavilability);
		System.out.println("Successfully validated " + expectedavilability);
		System.out.println(actualavilability);
		System.out.println(expectedavilability);
	}	
	@SuppressWarnings("static-access")
	public void productdescriptionValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct;
        actualproduct=page.getText(read.getData("validate.iphoneproductdescription.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
        expectedproduct=page.getText(read.getData("iphoneexpecetdproductdescription", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	@SuppressWarnings("static-access")
	public void priceandtaxValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualpriceandtax;
        String expectedpricandtax;
        actualpriceandtax=page.getText(read.getData("validate.iphonepriceandtax.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
        expectedpricandtax=page.getText(read.getData("iphoneexpecetdpriceandtax", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualpriceandtax, expectedpricandtax);
		System.out.println("Successfully validated " + expectedpricandtax);
		System.out.println(actualpriceandtax);
		System.out.println(expectedpricandtax);
	}	
	@SuppressWarnings("static-access")
	public void macpriceandtaxValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualprice;
        String expectedprice;
        actualprice=page.getText(read.getData("validate.macpriceandtax.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
        expectedprice=page.getText(read.getData("macexpectedpriceandtax", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualprice, expectedprice);
		System.out.println("Successfully validated " + expectedprice);
		System.out.println(actualprice);
		System.out.println(expectedprice);
	}	
	@SuppressWarnings("static-access")
	public void macproductdescriptionValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualproduct;
        String expectedproduct;
        actualproduct=page.getText(read.getData("validate.macproductdescription.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
        expectedproduct=page.getText(read.getData("macexpectedproductdescription", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualproduct, expectedproduct);
		System.out.println("Successfully validated " + expectedproduct);
		System.out.println(actualproduct);
		System.out.println(expectedproduct);
	}	
	@SuppressWarnings("static-access")
	public void totalValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualtotal;
        String expectedtotal;
        actualtotal=page.getText(read.getData("validate.total.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
        expectedtotal=page.getText(read.getData("total", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualtotal, expectedtotal);
		System.out.println("Successfully validated " + expectedtotal);
		System.out.println(actualtotal);
		System.out.println(expectedtotal);
	}
	@SuppressWarnings("static-access")
	public void updatedtotalValidation(WebDriver driver) throws IOException {
		page = new TutorialninjaPageactions(driver);
        read=new ReadLocatorsFile();
		String actualtotal;
        String expectedtotal;
        actualtotal=page.getText(read.getData("validate.total.txt",ProjectBaseConstantPaths.LOCATORS_FILE1));
        expectedtotal=page.getText(read.getData("expectedtotal", ProjectBaseConstantPaths.EXPECTED_FILE));
		Assert.assertEquals(actualtotal, expectedtotal);
		System.out.println("Successfully validated " + expectedtotal);
		System.out.println(actualtotal);
		System.out.println(expectedtotal);
	}
}
	

