package com.myStore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	WebElement signInButton;
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public MyAccountPage login(String un,String pwd) {
		signIn.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		signInButton.click();
		return new MyAccountPage();
	}
}
