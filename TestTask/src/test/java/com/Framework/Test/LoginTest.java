package com.Framework.Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Framework.Util.BaseTest;

public class LoginTest extends BaseTest {

	@Test(priority = 1 ,  dataProvider="LoginData")


	public void loginPageTitleValidation1(String UserName,String Password) throws InterruptedException {
		setUp();
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals(title, "Account Login");
		loginPage.DoLogin(UserName,Password);
	
		//tearDown();
		//tearDown();

	}

	 @DataProvider(name="LoginData")
     public static Object[][] getDataFromDataprovider(){
         return new Object[][] {
             { "Test@gmail.com", "Test" },
             { "Mounika@gmail.com", "Test" },
             {"Test123@gmail.com","test567"}
         };  
	
	
}
}



//test case-->login java brouser util element util
