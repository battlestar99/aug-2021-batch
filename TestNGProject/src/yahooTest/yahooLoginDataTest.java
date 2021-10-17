package yahooTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sauce.pages.loginPage;
import com.sauce.pages.yahooSignUpPage;

public class yahooLoginDataTest {
	
	WebDriver driver; 
	yahooSignUpPage yp;  ; 
		
		@BeforeTest
		public void setupTest() {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
			driver = new ChromeDriver();
		     yp = new yahooSignUpPage(driver);
		
		     driver.manage().deleteAllCookies();
		     
		     driver.manage().window().maximize();
			
			driver.navigate().to("https://login.yahoo.com/account/create");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			
		}
		
		@Parameters({"fName","LName","UName","Ypassword"})
		@Test
		
		public void validateSignUpData(String fName, String LName, String UName, String Ypassword  ) throws InterruptedException {
				
			
			//firstName.sendKeys(fName);
			Thread.sleep(2000);
			//firstName.clear();
			Thread.sleep(500);
			yp.getfirsname().sendKeys(fName);
			Thread.sleep(500);
			yp.getlastName().sendKeys(LName);
			Thread.sleep(500);
			yp.getUserName().sendKeys(UName);
			Thread.sleep(500);
			yp.getPassword().sendKeys(Ypassword);
			
			
		}
		
		
		@AfterTest
		public void quitTest() {
			
			driver.quit();
			
		}
		
	

}
