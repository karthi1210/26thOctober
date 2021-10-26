package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testings.BaseClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(id="email")
	private WebElement txtUser;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnClick;
	
	public LoginPage() {
	
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
	
	
	
	

}
