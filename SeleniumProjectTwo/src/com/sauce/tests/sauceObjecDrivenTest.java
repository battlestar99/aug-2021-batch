package com.sauce.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauce.pages.loginPage;

public class sauceObjecDrivenTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
		//int x = 23; 
		WebDriver driver = new ChromeDriver();
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//loginPage lp = new loginPage(driver);
		
		loginPage lp = new loginPage(driver);
		
		lp.getUserName().sendKeys("dfads");
		lp.getPassword().sendKeys("dffads");
		lp.getLoginButton().click();
		
		
		
		
		
		
		

	}

}
