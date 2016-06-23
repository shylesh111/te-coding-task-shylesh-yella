package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactory {
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="flash")
	WebElement flashMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/ul/li[1]/a")
	WebElement task1Link;
	
	@FindBy(how = How.XPATH, using = "//*[@id='login']/a")
	WebElement homePageLink;
	
	@FindBy(how = How.CSS, using = "button.radius")
	WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/a")
	WebElement logoutButton;
	
	//get user name textbox
	public WebElement getUserName(){
		return userName;
	}
	
	//get password textbox
	public WebElement getPassword(){
		return password;
	}
	
	//get login button
	public WebElement getLoginButton(){
		return loginButton;
	}
	
	//get logout button
	public WebElement getLogoutButton(){
		return logoutButton;
	}
	
	//get homePage Link
	public WebElement getHomepageLink(){
		return homePageLink;
	}
	
	//get task1 Link
	public WebElement getTask1Link(){
		return task1Link;
	}
	
	//get flash Message 
	public WebElement getFlashMessage(){
		return flashMessage;
	}
	
}
