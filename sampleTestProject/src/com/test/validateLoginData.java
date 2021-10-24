package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.loginPage;



public class validateLoginData extends baseClassNG {
	

	
	
	@BeforeMethod
	
	public void beforeEachTest() {
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	}
	
	
	@Test(priority=0)
	
	public void validatePositiveLogin() throws InterruptedException {
			
		Thread.sleep(2000);
		login.getUserName().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginButton().click();
		
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
     @Test(priority=1)
	
	public void validatLockedOutUserLogin() throws InterruptedException {
		
    	 Thread.sleep(2000);
    	 login.getUserName().sendKeys("locked_out_user");
    	 login.getPassword().sendKeys("secret_sauce");
    	 login.getLoginButton().click();
		
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
     @Test(priority=2)
 	
 	public void validatProblemUserLogin() throws InterruptedException {
 		
     	Thread.sleep(2000);
     	login.getUserName().sendKeys("problem_user");
     	login.getPassword().sendKeys("secret_sauce");
     	login.getLoginButton().click();
 		
 		
 		String expectedUrl = "https://www.saucedemo.com/inventory.html";
 		String actualUrl = driver.getCurrentUrl(); 
 		
 		Assert.assertEquals(actualUrl, expectedUrl);
 		
 		
 	}
	
	
     @Test(priority=3)
  	
  	public void validatglitchUserLogin() throws InterruptedException {
  		
      	Thread.sleep(2000);
      	login.getUserName().sendKeys("performance_glitch_user");
      	login.getPassword().sendKeys("secret_sauce");
  		login.getLoginButton().click();
  		
  		
  		String expectedUrl = "https://www.saucedemo.com/inventor.html";
  		String actualUrl = driver.getCurrentUrl(); 
  		
  		Assert.assertEquals(actualUrl, expectedUrl);
  		
  		
  	}
 	
	
	
	
	

}
