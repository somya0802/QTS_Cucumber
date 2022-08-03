package com.qts.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class environment {

public WebDriver driver; 

	public void initializeDriver(String browserName) {
		if("firefox".equalsIgnoreCase(browserName) || "".equals(browserName))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if("chrome".equalsIgnoreCase(browserName))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if("edge".equalsIgnoreCase(browserName) )
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
	
	
}
}
