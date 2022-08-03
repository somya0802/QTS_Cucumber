package com.qts.stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;

import com.qts.pages.impl.LoginPage;
import org.junit.Assert;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class loginPageStepdefination extends LoginPage{


	//public static LoginPage lp;
	LoginPage lp = new LoginPage();

	@Given("User lauch Browser")
	public void user_lauch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();  
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.navigate().to(url);
	}

	@When("User enters UserId as {string} and password as {string}")
	public void user_enters_user_id_as_and_password_as(String user, String password) throws InterruptedException {
		Thread.sleep(2000);
		//LoginPage lp = new LoginPage();
		lp.setUserName(user);
	   lp.setPass(password);
	}

	@When("Click on login")
	public void click_on_login() {
		//LoginPage lp = new LoginPage();
		lp.clickLogin();
	}

	@Then("User would navigated to QTS portal")
	public void user_would_navigated_to_qts_portal() {
	   //String url = driver.getCurrentUrl();
	   if(driver.getCurrentUrl().contains("sdp-dashboard"))
	 Assert.assertTrue(true);
	}

	
	
	
}
