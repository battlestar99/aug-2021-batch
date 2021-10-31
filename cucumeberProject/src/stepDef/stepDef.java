package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.loginPage;
import pages.yahooPage;

public class stepDef {
	
	WebDriver driver; 
	loginPage lp; 
	yahooPage yp; 
	
	
	@Before
	public void testsetup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Agile1Tech\\Desktop\\Automation Testing Class\\workspace-aug-2021\\drivers\\chromedriver.exe");	 
		driver = new ChromeDriver();
		lp=new loginPage(driver);
		yp=new yahooPage(driver);

	     driver.manage().deleteAllCookies();
	     
	     driver.manage().window().maximize();
		
	}
	
	
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		
		
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("^user is on the signup page$")
	public void user_is_on_the_signup_page() throws Throwable {
     
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	 
		lp.getUserName().sendKeys("standard_user");
		
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		
		lp.getPassword().sendKeys("secret_sauce");
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		
		lp.getLoginButton().click();
	}

	@Then("^user should be on the inventory page$")
	public void user_should_be_on_the_inventory_page() throws Throwable {
		
		String expectedUrl = "https://www.saucedemo.com/inventory.html"; 
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}
	
	@When("^user enters invalid username$")
	public void user_enters_invalid_username() throws Throwable {
		
		lp.getUserName().sendKeys("locked_out_user");
	}

	@When("^user enters invalid password$")
	public void user_enters_invalid_password() throws Throwable {
		
		lp.getPassword().sendKeys("secret_sauce");
	}

	@Then("^user should stay in the login page$")
	public void user_should_stay_in_the_login_page() throws Throwable {
		
		String expectedUrl = "https://www.saucedemo.com/";
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedUrl, actualUrl);
		
	}

// --------------------------------------------------
	
	@When("^user should be able to type in username text box$")
	public void user_should_be_able_to_type_in_username_text_box() throws Throwable {
	    
		boolean x = lp.getUserName().isEnabled();
		boolean y = lp.getUserName().isDisplayed();
		
		Assert.assertTrue(x);
		Assert.assertTrue(y);
		
	}

	@When("^user should be able to type in password text box$")
	public void user_should_be_able_to_type_in_password_text_box() throws Throwable {
	   
		boolean x = lp.getPassword().isEnabled();
		boolean y = lp.getPassword().isDisplayed();
		
		Assert.assertTrue(x);
		Assert.assertTrue(y);
		
	}

	@When("^user should be able to click on the click button$")
	public void user_should_be_able_to_click_on_the_click_button() throws Throwable {
	    
		boolean x = lp.getPassword().isEnabled();
		boolean y = lp.getPassword().isDisplayed();
		
		Assert.assertTrue(x);
		Assert.assertTrue(y);
	}

	
	@When("^user enters problem users username$")
	public void user_enters_problem_users_username() throws Throwable {
	    
		lp.getUserName().sendKeys("problem_user");
	}
	
	
// -------------------------------------------------
	
	@Given("^x$")
	public void x() throws Throwable {
	    
	}

	@When("^y$")
	public void y() throws Throwable {
	    
	}

	@Then("^z$")
	public void z() throws Throwable {
	    
	}


	
	@After
	public void testfinish() {
		
		driver.quit();
		
	}
	
	
	// ---------------------------------------------------
	
	

	@Then("^user should navigate to the \"([^\"]*)\"$")
	public void user_should_navigate_to_the(String expectedUrl) throws Throwable {
	    
		String actualUrl = driver.getCurrentUrl(); 
		Assert.assertEquals(expectedUrl, actualUrl);	
		
	}
	
	
	@When("^user enters \"([^\"]*)\" username for login$")
	public void user_enters_username_for_login(String username) throws Throwable {
		lp.getUserName().sendKeys(username);
	}

	@When("^user enters \"([^\"]*)\" password for login$")
	public void user_enters_password_for_login(String password) throws Throwable {
		lp.getPassword().sendKeys(password);
	}

	
// ---------------------------------------------------------
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws Throwable {
	    
		driver.get("https://login.yahoo.com/account/create");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^user enters \"([^\"]*)\" firstname in the sign up page$")
public void user_enters_firstname_in_the_sign_up_page(String firstname) throws Throwable {
	    
		yp.getFirstName().sendKeys(firstname);
	}

	@When("^user enters \"([^\"]*)\" lastname in the sign up page$")
	public void user_enters_lastname_in_the_sign_up_page(String lastname) throws Throwable {
	   
		yp.getlastName().sendKeys(lastname);
	}

	@When("^user enters \"([^\"]*)\" email address in the sign up page$")
	public void user_enters_email_address_in_the_sign_up_page(String email) throws Throwable {
	    
		yp.getEmailAddress().sendKeys(email);
		
	}

	@When("^user enters \"([^\"]*)\" password in the sign up page$")
	public void user_enters_password_in_the_sign_up_page(String password) throws Throwable {
	   
		yp.getPassword().sendKeys(password);
	}
	
	@When("^user Selects \"([^\"]*)\" country code in the sign up page$")
	public void user_Selects_country_code_in_the_sign_up_page(String countryCode) throws Throwable {
	    
		WebElement country = yp.getCountrycode();
		Select cc = new Select(country);
		
		cc.selectByValue(countryCode);
		
	}

	
	
	
	
	
	
	
	

}
