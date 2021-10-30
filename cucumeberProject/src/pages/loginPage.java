package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver; 
	
	public loginPage(WebDriver driver) {
		
		
		this.driver = driver; 
		
	}
	
	public WebElement getUserName() {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		return userName; 
	}
	
	public WebElement getPassword() {
		
		WebElement passWord = driver.findElement(By.id("password")); 
		return passWord; 
	}
	
	public WebElement getLoginButton() {
	
		WebElement loginButton = driver.findElement(By.id("login-button")); 
		return loginButton; 
}

	

}
