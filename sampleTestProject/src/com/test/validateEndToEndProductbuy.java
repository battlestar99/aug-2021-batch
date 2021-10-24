package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.cartPage;
import com.pages.checkOutPage;
import com.pages.inventoryPage;
import com.pages.loginPage;



public class validateEndToEndProductbuy extends baseClassNG {
	
	

	@Test
	
	public void endToEnd() throws InterruptedException {
		
		Thread.sleep(2000);
		
		login.getUserName().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginButton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		inventory.addBackPacktoCart().click();
		inventory.clickCartButton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		cart.getchekcout().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		checkout.getfirstName().sendKeys("Mike");
		checkout.getlastName().sendKeys("Tyson");
		checkout.getPostalCode().sendKeys("22030");
		checkout.getContinueButton().click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
		
		String actualUrl = driver.getCurrentUrl(); 
		
		Reporter.log("End to End Testing Scneario");
		Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
	
	
	
	
	

}
