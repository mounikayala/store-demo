package com.homeaway.test.store_demo_qa.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourAccountPage {
	private final WebDriver driver;
	public YourAccountPage(WebDriver driver){
		this.driver = driver;
	}
	public ProfilePage clickUserName(){
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.findElement(By.cssSelector("#wp-admin-bar-my-account > a"))
				.click();		
		return new ProfilePage(driver);
	}
}
