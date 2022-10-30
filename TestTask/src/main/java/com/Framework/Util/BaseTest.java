package com.Framework.Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.qa.pages.LoginPage;

public class BaseTest {
	
	private BrowserUtil browUtil;
	 private WebDriver driver;
	  public LoginPage loginPage;
	 	
	  //1. browser launch --->BrowserUtil-->launch browser method{
	  
	  
		@BeforeClass
		public void setUp() {
		 loginPage = new LoginPage(driver);
			browUtil=new BrowserUtil();
			driver =browUtil.launchBrowser("chrome");
			browUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		/*
		 * public void navigateUrl() {
		 * 
		 * browUtil.launchUrl("https://www.flipkart.com");
		 * 
		 * }
		 */
		
		/*
		 * @AfterTest public void tearDown() { driver.close(); }
		 */

}
