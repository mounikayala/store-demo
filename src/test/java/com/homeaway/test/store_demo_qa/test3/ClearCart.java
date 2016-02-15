package com.homeaway.test.store_demo_qa.test3;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.homeaway.test.store_demo_qa.PageObjects.CheckOutPage;
import com.homeaway.test.store_demo_qa.PageObjects.StoreHomePage;
import com.homeaway.test.store_demo_qa.base.StoreDemoQABase;

public class ClearCart extends StoreDemoQABase {
	StoreHomePage storeHomePage  = null;
	CheckOutPage checkOutPage = null;
	
	@Test
	public void emptyCart() {
		StoreHomePage storeHomePage = new StoreHomePage(this.driver);
		checkOutPage = storeHomePage.selectProductCategory().selectProduct().gotToCheckOut();
		String actualeMsg = checkOutPage.removeItem().getRemoveMessage();
		String expectedMsg="Oops, there is nothing in your cart.";
		Assert.assertEquals(actualeMsg, expectedMsg);
	}

}
