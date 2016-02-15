package com.homeaway.test.store_demo_qa.base;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreDemoQABase {
	public static WebDriver driver=null;
    public WebDriverWait wait=null;

    public StoreDemoQABase()
    {
    	 driver=new FirefoxDriver();
         driver.manage().window().maximize();
         wait=new WebDriverWait(driver, 5000);
         this.driver.get("http://store.demoqa.com/");
    }
   

    @AfterClass
    public static void closeBrowsers() throws Exception { 
    	driver.quit();  
    }
}
