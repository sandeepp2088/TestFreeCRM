/*
 * 
 * @author Sandeep Pardeshi
 */

package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
//import com.crm.qa.pages.NewContactPage;
import com.crm.qa.pages.LoginPage;

import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	
	public ContactPageTest()throws IOException {
		super();
	}
	
	
	ContactsPage contactsPage;
	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		//newContactpage = new NewContactPage();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		testUtil.switchToFrame();
		//contactsPage = homePage.clickOnContactsLink();
		
	}
	
	//@Test(priority=1)
	//public void verifyContactLinkTest() throws IOException {
		//testUtil.switchToFrame();
	//}

	
	//Is used to fetch the data from xml file stored in testdata package
	@DataProvider 
	public void getTestData() {
		
		
	}
	
	
	@Test(priority=1)
	public void validateCreateNewContact() {
		homePage.clickOnNewContactLink();
		contactsPage.createNewContact("Miss", "Mahi", "Pardeshi", "Google");
	}

		
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
}
 