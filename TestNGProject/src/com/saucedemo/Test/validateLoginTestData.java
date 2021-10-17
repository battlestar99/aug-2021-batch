package com.saucedemo.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sauce.pages.loginPage;

public class validateLoginTestData {
	
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
			
			driver.navigate().to("https://www.saucedemo.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			
		}
		
		@Parameters({"username","password","expectedUrl"})
		@Test
		
		public void validateLoginData(String username, String password, String expectedUrl ) throws InterruptedException {
				
			Thread.sleep(2000);
			lp.getUserName().sendKeys(username);
			lp.getPassword().sendKeys(password);
			lp.getLoginButton().click();
			
			
			
			String actualUrl = driver.getCurrentUrl(); 
			
			Assert.assertEquals(actualUrl, expectedUrl);
			
			
		}
		
		
		@AfterTest
		public void quitTest() {
			
			driver.quit();
			
		}
		

}
