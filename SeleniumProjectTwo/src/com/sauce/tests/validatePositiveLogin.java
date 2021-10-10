package com.sauce.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauce.pages.loginPage;

public class validatePositiveLogin {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		
		WebDriver driver = new ChromeDriver();
		
		loginPage login = new loginPage(driver);
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		login.getUserName().sendKeys("standard_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginButton().click();
		
		String Actualurl = driver.getCurrentUrl(); 
		
		System.out.println(Actualurl);
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
