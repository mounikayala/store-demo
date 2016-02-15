package com.homeaway.test.store_demo_qa.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private final WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public ProfilePage loginUserAfterLogOut(String userName, String password){
		this.login(userName, password);
		this.driver.findElement(By.id("wp-submit")).click();
		return new ProfilePage(driver);
	}
	public YourAccountPage loginUserFromHomePage(String userName, String password){
		this.login(userName, password);
		this.driver.findElement(By.id("login")).click();
		return new YourAccountPage(driver);
	}
	private void login(String userName, String password){
		this.driver.findElement(By.name("log")).sendKeys(userName);
		this.driver.findElement(By.name("pwd")).sendKeys(password);
		
	}
}
