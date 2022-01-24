package com.generic.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='email']")
	private WebElement email; 
	 
	@FindBy(xpath="//*[@id='pass']") 
	private WebElement password ;
	 
	@FindBy(xpath="//*[@name='login']")
	private WebElement logInButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}
	
	
	

}
