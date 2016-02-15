package com.homeaway.test.store_demo_qa.test2;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import com.homeaway.test.store_demo_qa.PageObjects.LoginPage;
import com.homeaway.test.store_demo_qa.PageObjects.ProfilePage;
import com.homeaway.test.store_demo_qa.PageObjects.StoreHomePage;
import com.homeaway.test.store_demo_qa.PageObjects.YourAccountPage;
import com.homeaway.test.store_demo_qa.base.StoreDemoQABase;

@SuppressWarnings("deprecation")
public class AccountUpdate extends StoreDemoQABase {
	StoreHomePage storeHomePage  = null;
	YourAccountPage yourAccountPage = null;
	ProfilePage profilePage = null;
	LoginPage loginPage = null;
	@Test
	public void updateAccount() {
		StoreHomePage storeHomePage = new StoreHomePage(this.driver);
		yourAccountPage = storeHomePage.clickMyAccount().loginUserFromHomePage("myalamanchili", "Testexercise@1");
		profilePage = yourAccountPage.clickUserName();
		loginPage = profilePage.setFirstName().setLastName().saveData().logOut();
		profilePage =loginPage.loginUserAfterLogOut("myalamanchili", "Testexercise@1");
		String firstName = profilePage.getFirstName();
		String lastName = profilePage.getLastName();		
		Assert.assertEquals("mounika", firstName);
		Assert.assertEquals("yala", lastName);

	}
	
	
	
}