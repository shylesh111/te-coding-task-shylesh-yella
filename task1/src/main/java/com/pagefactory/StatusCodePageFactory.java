package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StatusCodePageFactory {

	@FindBy(how = How.XPATH, using = "//*[@id='content']/ul/li[2]/a")
	WebElement task2Link;
	
	@FindBy(how = How.LINK_TEXT, using = "200")
	WebElement statusCode200Link;
	
	@FindBy(how = How.LINK_TEXT, using = "301")
	WebElement statusCode301Link;
	
	@FindBy(how = How.LINK_TEXT, using = "404")
	WebElement statusCode404Link;
	
	@FindBy(how = How.LINK_TEXT, using = "500")
	WebElement statusCode500Link;
	
	@FindBy(how = How.XPATH, using = "//*[@id='content']/div/p/a")
	WebElement returnPageLink;
	
	//get task2 Link
	public WebElement getTask2Link(){
		return task2Link;
	}
	
	public WebElement geStatusCodeLink(String statusCode){
		if("200".equals(statusCode)){
			return statusCode200Link;
		}  else if("301".equals(statusCode)){
			return statusCode301Link;
		} else if("404".equals(statusCode)){
			return statusCode404Link;
		} else if("500".equals(statusCode)){
			return statusCode500Link;
		} else {
			return null;
		}	
	}
	
	//get returnPage Link
	public WebElement getReturnPageLink(){
		return returnPageLink;
	}
	
}
