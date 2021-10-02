package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationCodeOne {

	public static void main(String[] args) throws InterruptedException {
		
	// setting up the properties for the chrome driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
	// 	creating an object of the webdriver 
		
		WebDriver driver = new ChromeDriver();
		
	// navigate to an url 
		
		driver.get("https://www.google.com/");
		
		
	// read the url 
		String a; 
		a = driver.getCurrentUrl();
		
	   System.out.println(a);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
