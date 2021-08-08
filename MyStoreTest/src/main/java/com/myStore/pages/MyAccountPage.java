package com.myStore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='account']")
	WebElement accountName;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	WebElement logo;
	
	
	public boolean verifyAccount() {
		return accountName.isDisplayed();
	}
	
	public HomePage gotoHome() {
		logo.click();
		return new HomePage();
	}
}
