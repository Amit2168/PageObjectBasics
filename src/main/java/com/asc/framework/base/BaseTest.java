package com.asc.framework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.asc.framework.common.util.TestUtil;

public class BaseTest {

	public  static WebDriver driver;
	public  static Properties prop;
	  
public  BaseTest() {
			try {
				prop = new Properties(); 
				FileInputStream fis = new FileInputStream("D:\\Training\\ASCFramework\\src\\main\\java\\com\\asc\\framework\\config\\config.properties"); 
				prop.load(fis); 
			    } 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			  }
				catch (IOException e) {
				e.printStackTrace();
			  }
 }

   /**
 *  Browser and other properties initialization   
 */
public static void initialization () {
	        
	  String browsername = prop.getProperty("browser"); // Get Browser from Properties file
      if (browsername.equals("chrome")) {
    	    System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe"); //lunch chrome browser 
			driver = new ChromeDriver(); 
         }
      else if (browsername.equals("firefox")) {
    	    System.setProperty("webdriver.gecko.driver", "D:\\Automation\\chromedriver_win32\\geckodriver.exe"); //lunch firefox browser
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("No such browser detail is provided in config file");
		}
   
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
        
   }
 
}
