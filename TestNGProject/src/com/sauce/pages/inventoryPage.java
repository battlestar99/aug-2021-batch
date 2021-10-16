package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class inventoryPage {
	
	WebDriver driver; 
	
	public inventoryPage(WebDriver driver) {
		
		this.driver=driver; 
		
		
	}
	
	
	public WebElement addBackPacktoCart() {
		
		WebElement x = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		return x; 
		
	}
	
  public WebElement clickCartButton() {
		
		WebElement x = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		return x; 
		
	}
	
	
	

}
