package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.cartPage;
import com.pages.checkOutPage;
import com.pages.inventoryPage;
import com.pages.loginPage;

public class baseClass {
	
	WebDriver driver; 
	loginPage login;
	inventoryPage inventory;
	cartPage cart;
	checkOutPage checkout;
	
	
	public void openChrome() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		 
		
		driver = new ChromeDriver();
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
	}
	
	public void openfirefox() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
				 
				driver = new ChromeDriver();
				
			     driver.manage().deleteAllCookies();
			     
			     driver.manage().window().maximize();
				
			}
	
	
	public void setupPages() {
		
		login = new loginPage(driver);
		inventory = new inventoryPage(driver);
		cart = new cartPage(driver);
		checkout = new checkOutPage(driver);
		
		
	}
	
	public void navigateUrl(String url) {
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void closeBrowser() {
		
		driver.quit();
		
	}
	
	
	

}
