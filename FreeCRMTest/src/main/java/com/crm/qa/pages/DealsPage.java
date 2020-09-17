package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DealsPage extends TestBase{
	
	

	@FindBy(xpath="//a[contains(text(),'New Deal')]")
	WebElement newDeal;
	
	//@FindBy(id="title")
//	WebElement titledeal;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	WebElement titledeal;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(id="probability")
	WebElement probability;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	
	public DealsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewDeal(String title, String comp, String prob ) {
		
		titledeal.sendKeys(title);
		company.sendKeys(comp);
		probability.sendKeys(prob);
		saveBtn.click();
	}

}
