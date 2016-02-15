package com.homeaway.test.store_demo_qa.test1;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import com.homeaway.test.store_demo_qa.PageObjects.CheckOutInfoPage;
import com.homeaway.test.store_demo_qa.PageObjects.CheckOutPage;
import com.homeaway.test.store_demo_qa.PageObjects.ProductCategoryPage;
import com.homeaway.test.store_demo_qa.PageObjects.StoreHomePage;
import com.homeaway.test.store_demo_qa.base.StoreDemoQABase;

public class OrderSubmit extends StoreDemoQABase {
	
	StoreHomePage storeHomePage  = null;
	CheckOutPage checkOutPage = null;
	
	@Test
	public void submitOrder() { 
		StoreHomePage storeHomePage = new StoreHomePage(this.driver);
		checkOutPage = storeHomePage.selectProductCategory().selectProduct().gotToCheckOut();
		String totalPrice = checkOutPage.clickContinue().selectCountry("USA").clickCalculate().getTotalPrice();
		Assert.assertEquals("$282.00", totalPrice); 
	}
}
