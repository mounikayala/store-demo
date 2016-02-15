package com.homeaway.test.store_demo_qa.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductCategoryPage {
	private final WebDriver driver;
	  public WebDriverWait wait=null;

	public ProductCategoryPage(WebDriver driver) {
		this.driver = driver;
		wait=new WebDriverWait(driver, 5000);
	}
	public ProductCategoryPage selectProduct(){
    	this.driver.findElement(By.linkText("Apple iPhone 4S 16GB SIM-Free – Black")).click();
		this.driver.findElement(By.className("wpsc_buy_button")).click();	
		return this;
		
    }
	public CheckOutPage gotToCheckOut(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("go_to_checkout")));
		this.driver.findElement(By.className("go_to_checkout")).click();
		return new CheckOutPage(driver);
	}
}
