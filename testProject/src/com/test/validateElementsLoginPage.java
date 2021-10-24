package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateElementsLoginPage extends testBase {
	
	
	@Test
	
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
	
	
	
@Test(dependsOnMethods={"validateLoginElementsDisplay"})
	
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
