package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'Contacts)]")
	WebElement contactlabel;
	
	@FindBy(xpath="//input[contains(@value, 'New Contact')]")
	WebElement newContact;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement lastname;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	public ContactsPage() throws IOException {
		PageFactory.initElements(driver, this);
		}
	
	public boolean verifyContactLabel() {
		return contactlabel.isDisplayed();
	}
	
	public void createNewContact(String title, String Ftname, String Ltname, String comp) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		firstname.sendKeys(Ftname);
		lastname.sendKeys(Ltname);
		company.sendKeys(comp);
		saveBtn.click();
	}

}
