package com.saucedemo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.qa.base.TestBase;

public class InventoryPage extends TestBase {
	@FindBy(xpath = "//div[contains(text(),'Products')]")
	WebElement InventoryPageHeader;
	@FindBy(xpath = "//button[contains(text(),'Open Menu')]")
	WebElement menu;
	@FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
	WebElement addToCart;
	@FindBy(xpath = "//img[@src='./img/sauce-backpack-1200x1500.jpg'] | //div[contains(text(),'Sauce Labs Backpack')]")
	WebElement Backpack;
	@FindBy(xpath = "//img[@src='./img/bike-light-1200x1500.jpg'] | //div[contains(text(),'Sauce Labs Bike Light')]")
	WebElement bikeLight;
	@FindBy(xpath = "//img[@src='./img/bolt-shirt-1200x1500.jpg'] | //div[contains(text(),'Sauce Labs Bolt T-Shirt')]")
	WebElement boltTShirt;
	@FindBy(xpath = "//img[@src='./img/sauce-pullover-1200x1500.jpg'] | //div[contains(text(),'Sauce Labs Fleece Jacket')]")
	WebElement fleeceJacket;
	@FindBy(xpath = "//img[@src='./img/red-onesie-1200x1500.jpg'] | //div[contains(text(),'Sauce Labs Onesie')]")
	WebElement onesie;
	@FindBy(xpath = "//img[@src='./img/red-tatt-1200x1500.jpg'] | //div[contains(text(),'Test.allTheThings() T-Shirt (Red)')]")
	WebElement tShirtRed;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement sortName;

	public InventoryPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyInventoryPageTitle() {
		return driver.getTitle();
	}

	public void clickOnAddToCart() {

	}

}
