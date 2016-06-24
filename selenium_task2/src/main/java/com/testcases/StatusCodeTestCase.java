package com.testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagefactory.StatusCodePageFactory;

public class StatusCodeTestCase {
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
		StatusCodePageFactory page = PageFactory.initElements(driver, StatusCodePageFactory.class);
		page.getTask2Link().click();
		Map<String, String> map = new HashMap<String,String>();
		map.put("200", "This page returned a 200 status code.");
		map.put("301", "This page returned a 301 status code.");
		map.put("404", "This page returned a 404 status code.");
		map.put("500", "This page returned a 500 status code.");
		for(String key : map.keySet()){
			validateStatusCode(page, key, map.get(key));
		}
	}
	
	private void validateStatusCode(StatusCodePageFactory page, String statusCode, String statusText){
	    page.geStatusCodeLink(statusCode).click();
	    Assert.assertTrue(driver.getPageSource().contains(statusText));
		page.getReturnPageLink().click();
	}
	
	@AfterClass
	  public void tearDown() throws Exception {
	    driver.quit();	   
	  }

}
