package learningNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NGBasic {
	
	// post-condition
		@AfterTest
		public void quitTest() {
			
			System.out.println("This is aftertest");
			
		}
	
	
	
	
	// pre-conidition
	@BeforeTest
	public void setupTest() {
		
		System.out.println("This is beforetest");
		
	}
	
	
	
	// the actual test
	@Test
	public void mainTest() {
		
		System.out.println("This is maintest");
		
	}
	
	
	

}
