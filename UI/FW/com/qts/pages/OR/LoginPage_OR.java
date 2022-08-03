package com.qts.pages.OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_OR {

	public static WebDriver driver; 
	
	@FindBy(xpath="//input[@id='idToken1']")
	@CacheLookup
	protected WebElement userName; 
	
	@FindBy(xpath= "//input[@id='idToken2']")
	@CacheLookup
	protected WebElement userPassword; 
	
	@FindBy(xpath= "//input[@id='_']")
	@CacheLookup
	protected WebElement loginBtn; 
}



