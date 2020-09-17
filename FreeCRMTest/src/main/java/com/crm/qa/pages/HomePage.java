package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: Sandeep Pardeshi')]")
	WebElement Usernamelabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactlink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContact;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDeal;
	
	@FindBy(xpath="//*[@id=\"navmenu\"]/ul/li[5]/ul/li[2]/a")
//	@FindBy(xpath="a[]contains(text(),'Product')")
	WebElement product;
		
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement taskslink;
	
	
	
	//Initializing the page object
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		}

	
	//Actions and methods
	
	public String verifyhomepagetitle() {
		return driver.getTitle();
	}
	
	public boolean verifycorrectUserName() {
		return Usernamelabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() throws IOException {
		contactlink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() throws IOException{
		dealslink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() throws IOException {
		taskslink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactlink).build().perform();
		newContact.click();
		}
	
	public void clickOnNewDealslink() {
		Actions action = new Actions(driver);
		action.moveToElement(dealslink).build().perform();
		newDeal.click();
	}
	
	public void clickOnNewProductlink() {
		Actions action = new Actions(driver);
		action.moveToElement(dealslink).build().perform();
		product.click();
				
		
	}
	
	
}
