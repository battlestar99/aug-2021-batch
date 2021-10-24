package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {
	
	WebDriver driver; 
	
	public cartPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getchekcout() {
		
		WebElement x = driver.findElement(By.id("checkout"));
		return x; 
	}

}
