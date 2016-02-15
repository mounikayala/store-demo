package com.homeaway.test.store_demo_qa.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class StoreHomePage {
	private final WebDriver driver;

	public StoreHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public ProductCategoryPage selectProductCategory() {
		new Actions(driver)
				.moveToElement(
						driver.findElement(By.cssSelector("#menu-item-33 > a")))
				.build().perform();
		this.driver.findElement(By.cssSelector("#menu-item-37 > a")).click();
		return new ProductCategoryPage(driver);
	}
	
	public LoginPage clickMyAccount(){
		this.driver.findElement(By.className("account_icon")).click();		
		return new LoginPage(driver);
	}

}
