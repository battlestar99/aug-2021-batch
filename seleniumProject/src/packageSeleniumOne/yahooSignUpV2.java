package packageSeleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooSignUpV2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\workspace-aug-2021\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		WebElement passWord = driver.findElement(By.id("usernamereg-password"));
		
		firstName.sendKeys("Mike");
		Thread.sleep(2000);
		firstName.clear();
		Thread.sleep(500);
		firstName.sendKeys("Mike");
		Thread.sleep(500);
		lastName.sendKeys("wick");
		Thread.sleep(500);
		userName.sendKeys("john_wick_7836338");
		Thread.sleep(500);
		passWord.sendKeys("dfalfjdj");
		
		Thread.sleep(500);
		
		passWord.clear();
		
		

		Thread.sleep(2000);
	
		driver.quit();
		
		
		
	}

}
