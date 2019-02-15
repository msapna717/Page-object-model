package com.saucedemo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.qa.base.TestBase;

public class LoginPage extends TestBase {
//Page-factory or Page-objects- OR:
	@FindBy(id = "user-name")
	WebElement username;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "//input[@class='login-button']")
	WebElement loginButton;

	// Initialize the objects
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// actions
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}

	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
