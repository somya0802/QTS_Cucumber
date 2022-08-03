package com.qts.pages.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qts.pages.OR.LoginPage_OR;

public class LoginPage extends LoginPage_OR {


	public void setUserName(String user) throws InterruptedException {
		Thread.sleep(5000);
		//userName.clear();
		//userName.sendKeys("smahlstedt");
		driver.findElement(By.xpath("//input[@id='idToken1']")).sendKeys(user);	
		//System.out.println(driver.findElement(By.xpath("//span[normalize-space()='User Name']")).getText());
	}
	
	public void setPass(String password) throws InterruptedException {
		//userPassword.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='idToken2']")).sendKeys(password);	
		//userPassword.sendKeys(password);
	}
	
	public void clickLogin() {
	driver.findElement(By.xpath("//input[@id='_']")).click();
	//loginBtn.click();
	}
}
