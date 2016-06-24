package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuItemsPageFactory {
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/ul/li[3]/a")
	WebElement task3Link;
	
	@FindBy(how = How.LINK_TEXT, using = "About")
	WebElement aboutButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Contact Us")
	WebElement contactButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Portfolio")
	WebElement portfolioButton;
	
	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement homeButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/p/a")
	WebElement returnPageLink;
	
	public WebElement getTask3Link(){
		return task3Link;
	}
	
	public WebElement getMenuItemsLink(String menuItems){
		if("About".equals(menuItems)){
			return aboutButton;
		}  else if("Contact Us".equals(menuItems)){
			return contactButton;
		} else if("Portfolio".equals(menuItems)){
			return portfolioButton;
		} else if("Home".equals(menuItems)){
			return homeButton;
		} else {
			return null;
		}	
	}
	
	//get returnPage Link
	public WebElement getReturnPageLink(){
		return returnPageLink;
	}

}
