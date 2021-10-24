package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.packages.loginPage;



public class validateLoginData {
	
WebDriver driver; 
loginPage lp ; 
	
	@BeforeTest
	public void setupTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		driver = new ChromeDriver();
		lp=new loginPage(driver);
	
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	
	@BeforeMethod
	
	public void beforeEachTest() {
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	}
	
	
	@Test(priority=0)
	
	public void validatePositiveLogin() throws InterruptedException {
			
		Thread.sleep(2000);
		lp.getUserName().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getLoginButton().click();
		
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
     @Test(priority=1)
	
	public void validatLockedOutUserLogin() throws InterruptedException {
		
    	 Thread.sleep(2000);
		lp.getUserName().sendKeys("locked_out_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getLoginButton().click();
		
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
     @Test(priority=2)
 	
 	public void validatProblemUserLogin() throws InterruptedException {
 		
     	Thread.sleep(2000);
 		lp.getUserName().sendKeys("problem_user");
 		lp.getPassword().sendKeys("secret_sauce");
 		lp.getLoginButton().click();
 		
 		
 		String expectedUrl = "https://www.saucedemo.com/inventory.html";
 		String actualUrl = driver.getCurrentUrl(); 
 		
 		Assert.assertEquals(actualUrl, expectedUrl);
 		
 		
 	}
	
	
     @Test(priority=3)
  	
  	public void validatglitchUserLogin() throws InterruptedException {
  		
      	Thread.sleep(2000);
  		lp.getUserName().sendKeys("performance_glitch_user");
  		lp.getPassword().sendKeys("secret_sauce");
  		lp.getLoginButton().click();
  		
  		
  		String expectedUrl = "https://www.saucedemo.com/inventor.html";
  		String actualUrl = driver.getCurrentUrl(); 
  		
  		Assert.assertEquals(actualUrl, expectedUrl);
  		
  		
  	}
 	
	
	@AfterTest
	public void quitTest() {
		
		driver.quit();
		
	}
	
	

}
