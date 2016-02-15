package com.homeaway.test.store_demo_qa.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	private final WebDriver driver;
	  public WebDriverWait wait=null;
	  public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver = driver;
	}
	public CheckOutInfoPage clickContinue(){
		this.driver.findElement(By.cssSelector("#checkout_page_container > div.slide1 > a > span")).click();
		return new CheckOutInfoPage(driver);
	}
	
	public CheckOutPage removeItem(){
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.findElement(By.xpath("//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[6]/form/input[4]")).click();
		return this;
	}
	
	public String getRemoveMessage(){
		String actualMsg=driver.findElement(By.className("entry-content")).getText();
		return actualMsg;
	}
}
