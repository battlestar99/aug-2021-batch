package com.saucedemo.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateLoginElements {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		//Thread.sleep(10000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passWord = driver.findElement(By.id("password")); 
		WebElement loginButton = driver.findElement(By.id("login-button")); 
		
		boolean userNameDisplay = userName.isDisplayed();
		boolean passWordDisplay = passWord.isDisplayed(); 
		boolean loginButtonDisplay = loginButton.isDisplayed(); 
		String loginButtonText = loginButton.getText(); 
		
		System.out.println(userNameDisplay);
		System.out.println(passWordDisplay);
		System.out.println(loginButtonDisplay);
		System.out.println(loginButtonText);
		
		driver.quit();
		
		
		

	}

}
