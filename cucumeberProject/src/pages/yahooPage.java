package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahooPage {
	
	WebDriver driver; 
	
	public yahooPage(WebDriver driver) {
		
		this.driver=driver; 
		
	}
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		
		return firstName; 
	}
	
public WebElement getlastName() {
		
		WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		
		return lastName; 
	}
	
public WebElement getEmailAddress() {
	
	WebElement emailAddress = driver.findElement(By.id("usernamereg-yid"));
	
	return emailAddress; 
}

public WebElement getPassword() {
	
	WebElement Password = driver.findElement(By.id("usernamereg-password"));
	
	return Password; 
}

public WebElement getCountrycode() {
	
	WebElement countryCode = driver.findElement(By.name("shortCountryCode"));
	
	return countryCode; 
}
	
	
	
	
	
	
	
	
	
	
	
	

}
