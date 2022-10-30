package com.Framework.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.Util.BaseTest;

public class RegisterTest extends BaseTest {
	
	
	@Test(priority = 1)

	public void loginPageTitleValidation() {
		setUp();
		}

}
/*
 * //navigateUrl();
 * 
 * String title = loginPage.getLoginPageTitle(); Assert.assertEquals(title,
 * "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"
 * );
 * 
 * //tearDown();
 */