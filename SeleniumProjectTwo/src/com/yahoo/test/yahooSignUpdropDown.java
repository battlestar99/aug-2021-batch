package com.yahoo.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahooSignUpdropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// selecting from month drop down
		
		WebElement month = driver.findElement(By.id("usernamereg-month"));
		
		Select ddMonth=new Select(month);
		
		Thread.sleep(2000);
		
		//ddMonth.selectByVisibleText("June");
		
		ddMonth.selectByIndex(7);
		
		// selecting from country code
		
		WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
		
		Select ddCountry = new Select(countryCode);
		
		Thread.sleep(2000);
		
		//ddCountry.selectByValue("CO");
		
		//ddCountry.selectByIndex(13);
		
		ddCountry.selectByVisibleText("Austria ‪(+43)‬");
		
		
		
		

	}

}
