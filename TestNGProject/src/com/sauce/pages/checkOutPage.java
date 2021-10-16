package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkOutPage {
	
WebDriver driver; 
	
	public checkOutPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.id("first-name"));
		return x; 
	}
	
public WebElement getlastName() {
		
		WebElement x = driver.findElement(By.id("last-name"));
		return x; 
	}

public WebElement getPostalCode() {
	
	WebElement x = driver.findElement(By.id("postal-code"));
	return x; 
}

public WebElement getContinueButton() {
	
	WebElement x = driver.findElement(By.id("continue"));
	return x; 
}


}
