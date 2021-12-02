package com.asc.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.asc.framework.base.BaseTest;

/**
 * @author AmitC2
 * page Factory for webElement 
 */

/**
 * @author AmitC2
 *
 */
public class HomePage extends BaseTest  {

	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement userlabel;

    @FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement contactslink;
    
    
    @FindBy(xpath="//a[contains(text(),'Deals')]")
    WebElement Dealslink;
    
    
    @FindBy(xpath="//a[contains(text(),'Tasks')]")
    WebElement Taskslink;

    @FindBy(xpath="//a[contains(text(),'New Contact')]")
    WebElement newcontactsLink;
    
    /**
     * initializing page object
     */
    public HomePage() {
		 
		 PageFactory.initElements(driver, this);
	 }
	 
    
     public String verifyHomepageTitle() {
    	 
    	return driver.getTitle();
     
     }
     
     public boolean UserNameLabel() {
    	 return userlabel.isDisplayed();
    	 
     }
     
     public ContactsPage ClickOncontactslink() {
    	 contactslink.click();
         return new ContactsPage();
     }
     
     public DealsPage ClickOnDealslink() {
    	 Dealslink.click();
    	 return new DealsPage();
     }
     
     public TaskPage ClickOnTaskslink() {
    	 Taskslink.click();
    	 return new TaskPage();
     
     }

     public void clickonNewContactsLink() {
   	  Actions action= new Actions(driver);
   	  action.moveToElement(contactslink).build().perform();
   	  newcontactsLink.click();
     
     }
       
      
    



}
