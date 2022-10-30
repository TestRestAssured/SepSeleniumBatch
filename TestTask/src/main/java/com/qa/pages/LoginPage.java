package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Framework.Util.ElementUtil;

public class LoginPage {

	private WebDriver driver;

	ElementUtil eleUtil = new ElementUtil(driver);

	
	// driver.findelement(By.xpath).click();
	

	private By UserName = By.id("input-email");//locator

	private By pwd = By.id("input-password");
	private By LoginButton = By.xpath("//input[@type='submit']");

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	public void DoLogin( String Un ,String pd ) throws InterruptedException {
		eleUtil.doSendKeys(UserName, Un);
		eleUtil.doSendKeys(pwd, pd);
		Thread.sleep(1000);
		//eleUtil.doIsDisplayed(LoginButton);
		//eleUtil.doClick(LoginButton);

	}

	public String getLoginPageTitle() {
		return eleUtil.getTitle();
	}

}
