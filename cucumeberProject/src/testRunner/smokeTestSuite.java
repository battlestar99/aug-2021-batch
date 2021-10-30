package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/Feature"},
		glue = {"stepDef"},
		plugin= {"pretty","html:target/cucumber-reports"},
		tags = {"@smoke"}
		
		
		)






public class smokeTestSuite {

}
