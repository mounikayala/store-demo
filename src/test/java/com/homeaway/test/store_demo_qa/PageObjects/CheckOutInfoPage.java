package com.homeaway.test.store_demo_qa.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutInfoPage {
	private final WebDriver driver;
	public WebDriverWait wait = null;

	public CheckOutInfoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public CheckOutInfoPage selectCountry(String country){
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver.findElement(By.id("current_country")).click();
        new Select(driver.findElement(By.name("country"))).selectByVisibleText(country);  
        return this;
	}
	
	public CheckOutInfoPage clickCalculate(){
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.findElement(By.name("wpsc_submit_zipcode")).click();
        return this;
	}
	
	public String getTotalPrice(){
		String totalPrice = driver.findElement(By.id("checkout_total")).getText();
		return totalPrice;
	}
}
