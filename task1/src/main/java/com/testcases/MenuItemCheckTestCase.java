package com.testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagefactory.MenuItemsPageFactory;

public class MenuItemCheckTestCase {
	
	 private WebDriver driver;
	 private String baseUrl;
	  
	@BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://zalando-edinc.rhcloud.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl);
	  }
	
	@Test
	  public void loginTestCases() throws Exception {
		MenuItemsPageFactory page = PageFactory.initElements(driver, MenuItemsPageFactory.class);
		page.getTask3Link().click();
		Map<String, String> map = new HashMap<String,String>();
		map.put("About", "About Page");
		map.put("Contact Us", "Contact Us Page");
		map.put("Portfolio", "Portfolio Page");		
		for(String key : map.keySet()){
			validateMenuItems(page, key, map.get(key));
		}
	}
	
	private void validateMenuItems(MenuItemsPageFactory page, String statusCode, String statusText){
	    page.getMenuItemsLink(statusCode).click();
	    Assert.assertTrue(driver.getPageSource().contains(statusText));
		page.getReturnPageLink().click();
	}
	@AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();	   
	  }	

}
