package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ProductPage extends TestBase{
	


	
	@FindBy(xpath="//a[contains(text(),'Products']")
	WebElement product;
	
	@FindBy(xpath="//input[@type='button' and @value= 'New Product']")
	WebElement newProduct;
	
	@FindBy(id="name")
	WebElement newProductName;

	@FindBy(id="cost")
	WebElement newProductCost;
	
	@FindBy(id="retail_value")
	WebElement newProductRetailValue;
	
	@FindBy(id="inventory_amount")
	WebElement newProductInvAmt;
	
	@FindBy(name="description")
	WebElement newProductDesc;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	WebElement saveBtn;
	
	public ProductPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnNewProductBtn() {
	newProduct.click();
	}
	
	
	public void NewProductDetaisFill(String pname, String pdesc) {
		newProductName.sendKeys(pname);
		newProductDesc.sendKeys(pdesc);
		saveBtn.click();
	}
	
}

