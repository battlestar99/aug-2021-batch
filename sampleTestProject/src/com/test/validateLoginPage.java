package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class validateLoginPage {
	
	WebDriver driver;
	int x; 
	
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
	public void validateWebUrl() {
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl, expectedUrl);
			
	}
	
	
	@Test(priority=1)
	public void validateWebTitle() {
		
		String expectedTitle = "Swag Products";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedTitle);
	}
	
	@AfterTest
	public void quitTest() {
		
		driver.quit();
		
	}
	

}
