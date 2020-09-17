package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class DealsPageTest extends TestBase {

	public DealsPageTest() throws IOException {
		super();

	}
	ContactsPage contactsPage;
	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	DealsPage dealsPage;
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dealsPage = new DealsPage();
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		testUtil.switchToFrame();
	}
	
	@Test(priority=1)
		public void validateCreateNewDeal() throws IOException{
		homePage.clickOnNewDealslink();
		
		dealsPage.createNewDeal("Mr", "CRM", "12");

		}
	
	
	@AfterMethod
		public void teardown() {
		driver.quit();
	}
}
