package com.Framework.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	
	}
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//WebElement username = driver.findElement(By.xpath());
	
	//1.driver.findElement(locator);
	
	//2.By .xpath("")
	
	//3.click();
	//3.sendKeys();
	
	
	public void doSendKeys(By locator, String value) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public String getTitle() {
		return driver.getTitle();
		
	}

}
