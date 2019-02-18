package com.saucedemo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.qa.base.TestBase;
import com.saucedemo.qa.pages.InventoryPage;
import com.saucedemo.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	InventoryPage inventoryPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1, description = "Testcase 1: verify page title is correct or not")
	public void loginPageTitleVerify() {
		String title = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	}

	@Test(priority = 2, description = "Testcase 2: Verify user is able to login with valid credentials")
	public void loginTest() {
		inventoryPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
