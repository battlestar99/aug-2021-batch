package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testBase {
	
	WebDriver driver; 
	
	@BeforeClass 
	
	
		
		public void setupTest() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
					 
					
					driver = new ChromeDriver();
				
				     driver.manage().deleteAllCookies();
				     
				     driver.manage().window().maximize();
					
					driver.navigate().to("https://www.saucedemo.com/");
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					
		
		
	}
	
	@AfterClass
	
	public void testclose() {
		
		driver.quit();
	}
	
	

}
