package com.myStore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myStore.base.TestBase;

public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")
	WebElement summerDresses;
	
	public SummerDressesPage gotoSummerDresses() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(women).build().perform();;
		summerDresses.click();
		return new SummerDressesPage();
	}
	
}
