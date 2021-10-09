package com.saucedemo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
      String actualUrl; 
      String actualTitle; 
      
      String expectedUrl= "https://www.saucedemo.com/";
      String expectedTtitle = "Swag Labs";
      
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		actualUrl = driver.getCurrentUrl();
		actualTitle = driver.getTitle(); 
		
		System.out.println(actualUrl);
		System.out.println(actualTitle);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
