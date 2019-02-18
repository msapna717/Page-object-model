package com.saucedemo.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.saucedemo.qa.base.TestBase;

public class InventoryPageTest extends TestBase {
	public InventoryPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();

	}

}
