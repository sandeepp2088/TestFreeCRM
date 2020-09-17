package com.crm.qa.pages;
 
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory = Object Repository
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Loginbtn;
	
	//@FindBy(xpath = "//img[contains(@class ='img-responsive')]")
	@FindBy(xpath ="/html/body/div[2]/div/div[1]/a/img")
	WebElement crmLogo;
	
	//Initializing the page object
	public LoginPage() throws IOException  {
		PageFactory.initElements(driver, this);
	}
	
	//Actions : methods
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login (String un, String pwd) throws IOException {
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		Loginbtn.click();
		return new HomePage();
	}
	
	
}
