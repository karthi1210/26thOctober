package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testings.BaseClass;

public class GMailLogin extends BaseClass {
	
	@FindBy(id="identifierId")
	private WebElement user;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement submit1;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement submit2;
	
	
	
	
	public WebElement getUser() {
		return user;
	}




	public WebElement getSubmit1() {
		return submit1;
	}




	public WebElement getPass() {
		return pass;
	}




	public WebElement getSubmit2() {
		return submit2;
	}




	public GMailLogin() {
		
		PageFactory.initElements(driver, this);
		
	}

}
