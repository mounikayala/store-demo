package com.homeaway.test.store_demo_qa.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {
	private final WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public ProfilePage setFirstName(){
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.clear();
		firstName.sendKeys("mounika");
		return this;
	}
	
	public ProfilePage setLastName(){
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.clear();
		lastName.sendKeys("yala");
		return this;
	}
	
	public ProfilePage saveData(){
		this.driver.findElement(By.id("submit")).click();
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return this;
	}
	
	public LoginPage logOut(){
		new Actions(driver)
		.moveToElement(
				driver.findElement(By
						.cssSelector("#wp-admin-bar-my-account > a")))
		.build().perform();
		this.driver.findElement(By.cssSelector("#wp-admin-bar-logout > a")).click();
		return new LoginPage(driver);
	}
	
	public String getFirstName(){
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String firstName = driver.findElement(By.id("first_name"))
				.getAttribute("value");
		return firstName;
		
	}
	
	public String getLastName(){
		String lastName = driver.findElement(By.id("last_name")).getAttribute(
				"value");
		return lastName;
	}
}
