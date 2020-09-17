package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	DealsPage dealsPage;
	
	public HomePageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		dealsPage = new DealsPage();
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homepagetitle = homePage.verifyhomepagetitle();
		Assert.assertEquals(homepagetitle, "CRMPRO", "Home page title is not matched");
		
	} 
	
	@Test(priority=2)
	public void VerifyUserNameLabelTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifycorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactLinkTest() throws IOException {
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(priority=4)
	public void verifyDealsLinkTest() throws IOException {
		testUtil.switchToFrame();
		homePage.clickOnDealsLink();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	}


