package com.asc.framework.pages;

import com.asc.framework.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
  	 
	 @FindBy(name="j_username")
	 WebElement username;
     
	 @FindBy(name="j_password")
	 WebElement password;
	 
	 @FindBy(xpath="//input[@name='submit']")
	 WebElement loginButton;
	 
	 /**
	 * initializing page object
	 */
	public LoginPage() {
		 
		 PageFactory.initElements(driver, this);
	 }
	 	
	 
	 //Actions
	 public String validatePageTitle() {
		 return driver.getTitle();
	 }
	 
	 public LoginPage login(String uid,String pwd) {
    	username.sendKeys(prop.getProperty("Username"));
    	password.sendKeys(prop.getProperty("Password"));
    	loginButton.click();
    return new LoginPage();
    	
    }

}
