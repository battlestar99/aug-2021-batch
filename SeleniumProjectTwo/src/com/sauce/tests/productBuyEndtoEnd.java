package com.sauce.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauce.pages.cartPage;
import com.sauce.pages.checkOutPage;
import com.sauce.pages.inventoryPage;
import com.sauce.pages.loginPage;

public class productBuyEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		
		WebDriver driver = new ChromeDriver();
		
		loginPage login = new loginPage(driver);
		inventoryPage inventory = new inventoryPage(driver);
		cartPage cart = new cartPage(driver);
		checkOutPage checkout = new checkOutPage(driver);
	     
		driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		driver.quit();
		

	}

}
