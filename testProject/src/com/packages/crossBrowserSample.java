package com.packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserSample {
	
	WebDriver driver; 
	
	
	@Parameters("Browser")
	@BeforeTest
	
	public void setupTest(String Browser) {
		
		if(Browser=="chrome") {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
			driver = new ChromeDriver();
			
		}
		
		if(Browser=="mozila") {
			
			System.setProperty("webdriver.Mozila.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
			driver = new FirefoxDriver();
			
		}
		
		if(Browser=="IEBrowser") {
			
			System.setProperty("webdriver.IE.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
			driver = new InternetExplorerDriver();
			
		}
		
		
		driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void mainTest() {
		
		
	}
	
	@AfterTest
	
	public void closeTest() {
		
		
	}

}
