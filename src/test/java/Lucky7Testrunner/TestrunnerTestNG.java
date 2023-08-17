package Lucky7Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {
	
	@CucumberOptions(
			
			features= {"Features"},
			glue= {"StepdefLucky7"}
	
	)
	
	public class Testrunner extends AbstractTestNGCucumberTests{}

}
