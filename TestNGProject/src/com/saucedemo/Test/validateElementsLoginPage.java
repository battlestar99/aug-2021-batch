package com.saucedemo.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateElementsLoginPage {
	
	WebDriver driver; 
	
	@BeforeTest
	public void setupTest() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		 
		
		driver = new ChromeDriver();
	
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=0)
	
	public void validateLoginElementsDisplay() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		
		boolean usernamedisplay = username.isDisplayed();
		boolean passworddisplay = password.isDisplayed(); 
		boolean logindisplay = loginButton.isDisplayed(); 
		
		
		Assert.assertEquals(usernamedisplay, true);
		Assert.assertEquals(passworddisplay, true);
		Assert.assertEquals(logindisplay, true);
		
	}
	
	
	
@Test(priority=01)
	
	public void validateLoginElementsEnabled() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
		
		boolean usernameEnable = username.isEnabled();
		boolean passwordEnable = password.isEnabled(); 
		boolean logindisEnable = loginButton.isEnabled(); 
		
		
		Assert.assertEquals(usernameEnable, true);
		Assert.assertEquals(passwordEnable, true);
		Assert.assertEquals(logindisEnable, true);
		
	}
	
	@AfterTest
	public void quitTest() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
