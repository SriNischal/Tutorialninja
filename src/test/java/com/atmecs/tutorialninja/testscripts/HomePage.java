package com.atmecs.tutorialninja.testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.atmecs.tutorialninja.Testsuite.TestBase;
import com.atmecs.tutorialninja.Testsuite.TutorialninjaPageactions;
import com.atmecs.tutorialsninja.utils.ProjectBaseConstantPaths;
import com.atmecs.tutorialsninja.utils.ReadLocatorsFile;
import com.atmecs.tutorialsninja.utils.TutorialsninjaProperties;
import com.atmecs.tutorialsninja.utils.Waitsclass;
import com.atmecs.tutorialsninja.validation.HomePageValidation;

public class HomePage extends TestBase {
	TutorialninjaPageactions page;
	TutorialsninjaProperties properties;
	ReadLocatorsFile read;
	Waitsclass wait;
	HomePageValidation validate;
	@SuppressWarnings("static-access")
	@Test
	public void home() throws IOException, InterruptedException {
		page=new TutorialninjaPageactions(driver);
		properties=new TutorialsninjaProperties();
		validate=new HomePageValidation();
		read=new ReadLocatorsFile();
		//wait=new Waitsclass();
		validate.titleValidate(driver);
		page.clickOnElement(read.readPropertiesFile("loc.searchtext.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
		page.sendKeys(read.readPropertiesFile("loc.searchtext.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), "iPhone");
        page.clickOnElement(read.readPropertiesFile("loc.searchbutton.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        validate.avilabilityValidation(driver);
        validate.productdescriptionValidation(driver);
        validate.priceandtaxValidation(driver);
        page.clickOnElement(read.readPropertiesFile("loc.addtocart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.cart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.viewcart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clear(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));        
        page.sendKeys(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), "2");
        page.clickOnElement(read.readPropertiesFile("loc.update.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.continue.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.search.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
		page.sendKeys(read.readPropertiesFile("loc.search.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), "MacBook Air");
		page.clickOnElement(read.readPropertiesFile("loc.searchbutton.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
		validate.avilabilityValidation(driver);
		validate.macproductdescriptionValidation(driver);
		validate.macpriceandtaxValidation(driver);
		page.clickOnElement(read.readPropertiesFile("loc.addcart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.cart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.viewcart.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.quantity.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clickOnElement(read.readPropertiesFile("loc.quantities.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.clear(read.readPropertiesFile("loc.quantities.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        page.sendKeys(read.readPropertiesFile("loc.quantities.txt", ProjectBaseConstantPaths.LOCATORS_FILE1), "3");
        page.clickOnElement(read.readPropertiesFile("loc.update.btn", ProjectBaseConstantPaths.LOCATORS_FILE1));
        validate.totalValidation(driver);
        page.clickOnElement(read.readPropertiesFile("loc.remover.txt", ProjectBaseConstantPaths.LOCATORS_FILE1));
        validate.updatedtotalValidation(driver);
	}
	
}
