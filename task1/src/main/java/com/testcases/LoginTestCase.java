package com.testcases;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pagefactory.LoginPageFactory;
import com.util.BasicUtil;

public class LoginTestCase {
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
		LoginPageFactory page = PageFactory.initElements(driver, LoginPageFactory.class);
		page.getTask1Link().click();
		JSONObject jsonObject = BasicUtil.getJSONObject();
		System.out.println(jsonObject);
		JSONArray list = (JSONArray)jsonObject.get("login");
		for (Object fieldObj : list)
		{
			JSONObject field = (JSONObject) fieldObj;			
			String userName = (String) field.get("username");
			String password = (String) field.get("password");
			String flashMessage = (String) field.get("flashmessage");
			validateLogin(page, userName, password, flashMessage);
		}
	}
	
	private void validateLogin(LoginPageFactory page, String userName, String password, String flashMessage){
		page.getUserName().clear();
		page.getUserName().sendKeys(userName);
		page.getPassword().clear();
		page.getPassword().sendKeys(password);
		page.getLoginButton().click();
		String actualText = page.getFlashMessage().getText();
		Assert.assertTrue(actualText.contains(flashMessage));
		System.out.println(actualText);
		if(actualText.contains("You logged into a secure area!")){
			page.getLogoutButton().click();
		}	

	}
	@AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();	   
	  }	
}
