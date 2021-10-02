package basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationCodeTwo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		
		WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver1.get("https://www.twitter.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		driver1.quit();
		
		
		
		
	}

}
