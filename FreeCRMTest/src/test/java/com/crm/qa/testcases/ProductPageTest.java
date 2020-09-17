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
import com.crm.qa.pages.ProductPage;
import com.crm.qa.util.TestUtil;

public class ProductPageTest extends TestBase{

	
	public ProductPageTest() throws IOException {
		super();
		
	}
	ContactsPage contactsPage;
	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	DealsPage dealsPage;
	ProductPage productPage;
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		contactsPage = new ContactsPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dealsPage = new DealsPage();
		productPage = new ProductPage();
		homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		testUtil.switchToFrame();
	}
	
	@Test(priority=1)
		public void validateCreateProduct() throws IOException{
		homePage.clickOnNewProductlink();
		}
	
	@Test(priority=2)
	public void validateNewProductbutton() {
		homePage.clickOnNewProductlink();
		productPage.ClickOnNewProductBtn();
	}
	
	@Test(priority=3)
	public void validateCreateNewProductTest() {
		homePage.clickOnNewProductlink();
		productPage.ClickOnNewProductBtn();
		productPage.NewProductDetaisFill("Test first product","This is entered via Automation");
		
	}
	
	
	@AfterMethod
		public void teardown() {
		driver.quit();
	}
}
