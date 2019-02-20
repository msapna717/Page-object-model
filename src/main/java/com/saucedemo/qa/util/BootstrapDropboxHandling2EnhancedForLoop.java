package com.saucedemo.qa.util;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropboxHandling2EnhancedForLoop {
	static WebDriver driver;

	@Test
	public static void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sapnamishra/Documents/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("menu1")).click();
		List<WebElement> dd_list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		System.out.println("list size is: " + dd_list.size());

		for (WebElement element : dd_list) {
			String innerHTML = element.getAttribute("innerHTML");
			if (innerHTML.contains("JavaScript")) {
				element.click();
				break;
			}
			System.out.println("Values from dropdown is====== " + innerHTML);

		}
		Thread.sleep(3000);
		driver.quit();

	}
}
