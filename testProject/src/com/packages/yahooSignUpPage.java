package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahooSignUpPage {
	
WebDriver driver; 
	
	public yahooSignUpPage(WebDriver driver) {
		
		
		this.driver = driver; 
		
	}
	
	public WebElement getfirsname() {
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		return firstName; 
	}
	
	public WebElement getlastName() {
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		return lastName; 
	}
	
	public WebElement getUserName() {
	
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		return userName; 
}
	
	public WebElement getPassword() {
		
		WebElement passWord = driver.findElement(By.id("usernamereg-password"));
		 return passWord; 
}       


}
