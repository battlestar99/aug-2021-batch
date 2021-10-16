package learningNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NGBasicOne {
	
	
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is beforeTest");
		
	}
	
	
	@BeforeMethod
	public void setupEachTest() {
		
		System.out.println("This is before method");	
		
		
	}
	
	// one test annoations refers to one test case
	@Test
	public void amainTest() {
		
		System.out.println("This is test one");
		
	}
	
	
	
	@Test
	public void bmainTest() {
		
		System.out.println("This is test two");
		
	}
	
	
	
	@AfterMethod 
	public void afterEachTest() {
		
		
		System.out.println("This is after method");
		
	}
	
	@AfterTest
	public void quitTest() {
		
		System.out.println("This is after test");
	}

}
