package com.asc.framework.uitest.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.asc.framework.base.BaseTest;
import com.asc.framework.common.util.TestUtil;
import com.asc.framework.pages.HomePage;
import com.asc.framework.pages.LoginPage;

public class LoginPageTest extends BaseTest {
      
	LoginPage loginPage;
	TestUtil  testUtill;
	public LoginPageTest() {
		super();
	}
 
	@BeforeMethod
	   public void setup() {
    	initialization();
    loginPage= new LoginPage();
	testUtill = new TestUtil();
    loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }
    
    @Test(priority=1)
    public void VerifyLoginPageTest() {
    	String PaActualPageTitle=driver.getTitle();
    	String ExpectedTitle="Risk Management | Information Security | Compliance";
    	System.out.printf("Actual Title is: "+ PaActualPageTitle);
    	Assert.assertEquals(PaActualPageTitle, ExpectedTitle);
    }
    
/*     @Test(priority=2)
    public void LoginTest() {
    	homePage=loginPage.login(prop.getProperty("Username"),prop.getProperty("Password"));
    	
       
        
    @AfterMethod
    public void teardown() {
         driver.quit();	
    }*/


}
