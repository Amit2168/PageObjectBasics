package com.asc.framework.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.asc.framework.base.BaseTest;

public class ContactsPage extends BaseTest {
       
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
     WebElement contactslabel;
	
	@FindBy(name="title")
    WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="middle_initial")
	WebElement middleName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement compnayName;
	
	public ContactsPage() {  
	PageFactory.initElements(driver, this);
	
}

    public boolean contactsLabel() {
    	return contactslabel.isDisplayed();
    	
    }

   public void createNewContacts(String Title,String fName,String MName,String lName,String CompName) {
	   Select  select = new Select (title);
	   select.selectByVisibleText(Title);
	   firstName.sendKeys(fName);
	   middleName.sendKeys(MName);
	   lastName.sendKeys(lName);
	   compnayName.sendKeys(CompName);
   }  

   
   
   
   

}

    











