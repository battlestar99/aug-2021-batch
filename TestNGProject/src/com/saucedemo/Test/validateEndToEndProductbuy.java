package com.saucedemo.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sauce.pages.cartPage;
import com.sauce.pages.checkOutPage;
import com.sauce.pages.inventoryPage;
import com.sauce.pages.loginPage;

public class validateEndToEndProductbuy {
	
	
WebDriver driver; 
loginPage login;
inventoryPage inventory;
cartPage cart;
checkOutPage checkout;
	
	@BeforeTest
	public void setupTest() {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		 
		
		driver = new ChromeDriver();
		
		login = new loginPage(driver);
		inventory = new inventoryPage(driver);
		cart = new cartPage(driver);
		checkout = new checkOutPage(driver);
	
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
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
	
	@AfterTest
	public void quitTest() {
		
		driver.quit();
		
	}
	
	
	
	

}
