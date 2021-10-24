package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pages.cartPage;
import com.pages.checkOutPage;
import com.pages.inventoryPage;
import com.pages.loginPage;

public class baseClassNG {
	
	WebDriver driver; 
	loginPage login;
	inventoryPage inventory;
	cartPage cart;
	checkOutPage checkout;
	
	@BeforeClass 
	
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
	
	@AfterClass
	public void teardownTest() {
		
		driver.quit();
		
	}
	
	
	

}
