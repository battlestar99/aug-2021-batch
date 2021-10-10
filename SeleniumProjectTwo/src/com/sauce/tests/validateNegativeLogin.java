package com.sauce.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauce.pages.loginPage;

public class validateNegativeLogin {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		
		WebDriver driver = new ChromeDriver();
		
		loginPage login = new loginPage(driver);
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		login.getUserName().sendKeys("locked_out_user");
		login.getPassword().sendKeys("secret_sauce");
		login.getLoginButton().click();
		
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl(); 
		
		System.out.println(url);
		
		driver.quit();
	}

}
