package packageSeleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkNavigation {

	public static void main(String[] args) throws InterruptedException {
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		
		WebElement helpLink = driver.findElement(By.linkText("Help"));
		
		helpLink.click();
		
		String helpPageUrl = driver.getCurrentUrl();
		String helpPageTitle =  driver.getTitle(); 
		
		System.out.println(helpPageUrl);
		System.out.println(helpPageTitle );
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		helpPageUrl = driver.getCurrentUrl();
		helpPageTitle =  driver.getTitle(); 
		
		System.out.println(helpPageUrl);
		System.out.println(helpPageTitle );
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
